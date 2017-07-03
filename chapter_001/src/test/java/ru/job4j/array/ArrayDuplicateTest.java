package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Alexey Leishin (lepishin.ao@yandex.ru)
* @version 1
* @since 06.06.2017
*/
public class ArrayDuplicateTest {
	/**
	* Test remove.
	*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate array = new ArrayDuplicate();
		String[] data = {"1", "2", "1", "3", "2"};
		String[] result = array.remove(data);
		String[] expected = {"1", "2", "3"};
		assertThat(result, is(expected));
    }
	/**
	* Test remove2.
	*/
    @Test
    public void whenRemoveAllDuplicatesThenDropIt() {
        ArrayDuplicate array = new ArrayDuplicate();
		String[] input = {"1", "1", "2", "2", "3", "3"};
		String[] result = array.remove2(input);
		String[] expected = {"1", "2", "3"};
		assertThat(result, arrayContainingInAnyOrder(expected));
    }
}
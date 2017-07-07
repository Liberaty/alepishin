package ru.job4j.lasttask;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Alexey Lepishin (lepishin.ao@yandex.ru)
* @version 1
* @since 06.07.2017
*/
public class BooleanSortArrayTest {
	/**
	* Test isSort.
	*/
    @Test
	public void whenArrayIsSortedThenTrue() {
        BooleanSortArray array = new BooleanSortArray();
		int[] data = {1, 2, 3, 4, 5};
		boolean result = array.isSort(data);
		boolean expected = true;
		assertThat(result, is(expected));
    }
}
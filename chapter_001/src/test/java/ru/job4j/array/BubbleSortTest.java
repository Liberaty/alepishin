package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Alexey Leishin (lepishin.ao@yandex.ru)
* @version 1
* @since 01.06.2017
*/
public class BubbleSortTest {
	/**
	* Test sort.
	*/
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
		int[] data = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] result = bubbleSort.sort(data);
		int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(result, is(expected));
    }
}
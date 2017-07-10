package ru.job4j.lasttask;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Alexey Leishin (lepishin.ao@yandex.ru)
* @version 1
* @since 06.06.2017
*/
public class PlusTwoArrayTest {
	/**
	* Test arrayAddition.
	*/
    @Test
	public void whenAdditionArrayAndSortThenEarly() {
		PlusTwoArray action = new PlusTwoArray();
		int[] arrayOne = {1, 3, 5, 7, 9};
		int[] arrayTwo = {2, 4, 6, 8, 10};
		int[] data = action.arrayAddition(arrayOne, arrayTwo);
		int[] result = action.bubleSort(data);
		int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		assertThat(data, is(expected));
	}
}
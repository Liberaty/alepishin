package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Alexey Leishin (lepishin.ao@yandex.ru)
* @version 1
* @since 02.06.2017
*/
public class RotateArrayTest {
	/**
	* Test rotate.
	*/
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray twoArray = new RotateArray();
		int[][] data = {{1, 2}, {3, 4}};
		int[][] result = twoArray.rotate(data);
		int[][] expected = {{3, 1}, {4, 2}};
		assertThat(result, is(expected));
    }
	/**
	* Test rotate.
	*/
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray twoArray = new RotateArray();
		int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] result = twoArray.rotate(data);
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(result, is(expected));
    }
}
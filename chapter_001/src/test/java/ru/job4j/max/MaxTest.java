package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Alexey Leishin (lepishin.ao@yandex.ru)
* @version 1
* @since 23.04.2017
*/
public class MaxTest {
	/**
	* Test max1.
	*/
	@Test
	public void whenMaxFourBiggerTwoThenFour() {
		Max maxValue = new Max();
		int verifiable = maxValue.max(4, 2);
		int expected = 4;
		assertThat(verifiable, is(expected));
    }
	/**
	* Test max2.
	*/
	@Test
	public void whenMaxFourBiggerTwoButSmallerThreeThenFourMax() {
		Max maxValue = new Max();
		int verifiable = maxValue.max(4, 2, 3);
		int expected = 4;
		assertThat(verifiable, is(expected));
    }
}
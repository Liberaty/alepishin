package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Alexey Leishin (lepishin.ao@yandex.ru)
* @version 1
* @since 30.04.2017
*/
public class PointTest {
	/**
	* Test is.
	*/
	@Test
	public void whenPointTwoAndThreeOnLineTwoAndTwoThanTrue() {
		Point pointOnLine = new Point(2, 3);
		boolean verifiable = pointOnLine.is(2, 2);
		boolean expected = true;
		assertThat(verifiable, is(expected));
    }
}
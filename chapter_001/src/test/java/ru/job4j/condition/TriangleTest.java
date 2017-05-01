package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Alexey Leishin (lepishin.ao@yandex.ru)
* @version 1
* @since 30.04.2017
*/
public class TriangleTest {
	/**
	* Test is.
	*/
	@Test
	public void whenPointTwoAndThreeOnLineTwoAndTwoThanTrue() {
		Point a = new Point(2.0, 1.0);
		Point b = new Point(5.0, 1.0);
		Point c = new Point(3.5, 3.5);
		Triangle triangle = new Triangle(a, b, c);
		triangle.side1(a, b);
		triangle.side2(b, c);
		triangle.side3(a, c);
		double verifiable = triangle.area();
		// double expected = 3.74;
		assertThat(verifiable, closeTo(expected, 3.74));
    }
}
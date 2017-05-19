package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Alexey Leishin (lepishin.ao@yandex.ru)
* @version 1
* @since 15.05.2017
*/
public class PaintTest {
	/**
	* Test piramid.
	*/
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
	/**
	* Test piramid.
	*/
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
	   Paint paint = new Paint();
       String result = paint.piramid(3);
	   final String line = System.getProperty("line.separator");
	   String expected = String.format("  ^  %s ^^^ %s^^^^^%s", line, line, line);
       assertThat(result, is(expected));
    }
}
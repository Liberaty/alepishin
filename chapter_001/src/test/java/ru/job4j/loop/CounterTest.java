package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Alexey Leishin (lepishin.ao@yandex.ru)
* @version 1
* @since 07.05.2017
*/
public class CounterTest {
	/**
	* Test add.
	*/
	@Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
		int verifiable = counter.add(1, 10);
		int expected = 30;
		assertThat(verifiable, is(expected));
    }
}
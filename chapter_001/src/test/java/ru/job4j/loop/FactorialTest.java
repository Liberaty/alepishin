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
public class FactorialTest {
	/**
	* Test calc.
	*/
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		Factorial factorial = new Factorial();
		int verifiable = factorial.calc(5);
		int expected = 120;
		assertThat(verifiable, is(expected));
    }
	/**
	* Test calc.
	*/
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
		Factorial factorial = new Factorial();
		int verifiable = factorial.calc(0);
		int expected = 1;
		assertThat(verifiable, is(expected));
    }
}
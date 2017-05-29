package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Alexey Leishin (lepishin.ao@yandex.ru)
* @version 1
* @since 29.05.2017
*/
public class TurnTest {
	/**
	* Test back.
	*/
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
		String result = turn.back(4, 1, 6, 2);
		String expected = "2, 6, 1, 4";
		assertThat(result, is(expected));
    }
	/**
	* Test back.
	*/
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
		String result = turn.back(1, 2, 3, 4, 5);
		String expected = "5, 4, 3, 2, 1";
		assertThat(result, is(expected));
    }
}
package ru.job4j.array;
/**
 * Class Turn.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 29.05.2017
 */
public class Turn {
	/**
	 * back.
	 * @param array array.
	 * @return array.
	 */
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int count = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = count;
		}
		return 
	}
}
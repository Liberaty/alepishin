package ru.job4j.loop;
/**
 * Class Counter.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 07.05.2017
 */
public class Counter {
	/**
	 * Method add.
	 * @param start - int.
	 * @param finish - int.
	 * @return result - int.
	 */
	public int add(int start, int finish) {
		int result = 0;
		for ( ; start <= finish; start++) {
			int count = start % 2;
			int auxiliaryCount = count == 0 ? start : 0;
			result = result + auxiliaryCount;
		}
		return result;
	}
}
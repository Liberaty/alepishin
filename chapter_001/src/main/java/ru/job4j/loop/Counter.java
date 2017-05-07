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
			if (start % 2 == 0) {
				result += start;
			}
		}
		return result;
	}
}
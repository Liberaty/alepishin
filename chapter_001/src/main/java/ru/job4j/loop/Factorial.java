package ru.job4j.loop;
/**
 * Class Factorial.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 07.05.2017
 */
public class Factorial {
	/**
	 * Method calc.
	 * @param n - int.
	 * @return result - int.
	 */
	public int calc(int n) {
		int result = 1;
		if (n == 0) {
			return result;
		} else {
			for (int count = 1; count <= n; count++) {
				result *= count;
			}
			return result;
		}
	}
}
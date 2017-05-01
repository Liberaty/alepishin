package ru.job4j.max;
/**
 * Class Max.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 23.04.2017
 */
public class Max {
	/**
     * Max1.
     * @param first - first.
	 * @param second - second.
	 * @return result - result.
     */
	public int max1(int first, int second) {
		return first > second ? first : second;
	}
	/**
     * Max2.
     * @param first - first.
	 * @param second - second.
	 * @param third - third.
	 * @return this.max1 - max.
     */
	public int max2(int first, int second, int third) {
		return this.max1(this.max1(first, second), third);
	}
}
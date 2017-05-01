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
     * Max.
     * @param first - first.
	 * @param second - second.
	 * @return result - result.
     */
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	/**
     * Overload Max.
     * @param first - first.
	 * @param second - second.
	 * @param third - third.
	 * @return this.max1 - max.
     */
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}
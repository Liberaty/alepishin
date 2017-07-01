package ru.job4j.array;

import java.util.Arrays;
/**
 * Class ArrayDuplicate.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 06.06.2017
 */
public class ArrayDuplicate {
	/**
	 * remove.
	 * @param array array.
	 * @return Arrays.
	 */
	public String[] remove(String[] array) {
		String bufer = null;
		int count = array.length;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j == i || j == count) {
					continue;
				}
				if (array[i].equals(array[j])) {
					count--;
					bufer = array[count];
					array[count] = null;
					array[j] = bufer;
				}
			}
		}
		return Arrays.copyOf(array, count);
	}
}
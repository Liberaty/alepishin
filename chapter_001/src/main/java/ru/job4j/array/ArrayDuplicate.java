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
		String[] words = new String[array.length];
		String addedWord = "";
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (addedWord != array[i]) {
			words[count] = array[i];
			count++;
			addedWord = words[count - 1];
			}
		}
		return Arrays.copyOf(words, count);
	}
}
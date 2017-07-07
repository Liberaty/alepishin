package ru.job4j.lasttask;

import java.util.Arrays;
/**
 * Class BooleanSortArray.
 *
 * @author Alexey Lepishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 06.07.2017
 */
public class BooleanSortArray {
	/**
	 * isSort.
	 * @param array array.
	 * @return Arrays.
	 */
	 public boolean isSort(int[] array) {
		int[] newArray = Arrays.copyOf(array, array.length);
        Arrays.sort(newArray);
        for (int i = 0; i < array.length; ++i) {
            if (array[i] != newArray[i]) {
                return false;
            }
        }
        return true;
	 }
}
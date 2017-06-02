package ru.job4j.array;
/**
 * Class BubbleSort.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 01.06.2017
 */
public class BubbleSort {
	/**
	 * sort.
	 * @param array array.
	 * @return array.
	 */
	public int[] sort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
           for (int j = 0; j < i; j++) {
               if (array[j] > array[j + 1]) {
                   int tmp = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = tmp;
                }
            }
        }
	    return array;
	}
}
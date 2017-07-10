package ru.job4j.lasttask;

/**
 * Class PlusTwoArray.
 *
 * @author Alexey Lepishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 06.07.2017
 */
public class PlusTwoArray {
	/**
	 * arrayAddition.
	 * @param firstArray firstArray.
	 * @param secondArray secondArray.
	 * @return Arrays.
	 */
	 public int[] arrayAddition(int[] firstArray, int[] secondArray) {
		int[] newArray = new int[firstArray.length + secondArray.length];
		int count = 0;
		while (count < firstArray.length) {
			newArray[count] = firstArray[count];
			count++;
		}
		while (count < newArray.length) {
			newArray[count] = secondArray[(newArray.length - count) - 1];
			count++;
		}
		return newArray;
	 }
	 /**
	 * bubleSort.
	 * @param array array.
	 * @return array.
	 */
	 public int[] bubleSort(int[] array) {
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
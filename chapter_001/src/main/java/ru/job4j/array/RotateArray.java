package ru.job4j.array;
/**
 * Class RotateArray.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 02.06.2017
 */
public class RotateArray {
	/**
	 * rotate.
	 * @param array array.
	 * @return array.
	 */
	public int[][] rotate(int[][] array) {
		int length = array.length - 1;
		int tmp = 0;
		for (int i = 0; i <= (length) / 2; i++) {
			for (int j = i; j < length - i; j++) {
				tmp = array[i][j];
				array[i][j] = array[length - j][i];
				array[length - j][i] = array[length - i][length - j];
				array[length - i][length - j] = array[j][length - i];
				array[j][length - i] = tmp;
			}
		}
		return array;
	}
}
package ru.job4j.loop;
/**
 * Class Board.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 08.05.2017
 */
public class Board {
	/**
	 * paint.
	 * @param width - int.
	 * @param heigth - int.
	 * @return result - String.
	 */
	public String paint(int width, int height) {
		StringBuilder sBuilder = new StringBuilder("");
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j++) {
				if(height % 2 == 0) {
					(width % 2 == 0) ? (sBuilder.append("x")) : (sBuilder.append(" "));
				} else {
					(width % 2 == 0) ? (sBuilder.append(" ")) : (sBuilder.append("x"));
				}
			}
		}
		String result = sBuilder.toString();
		return result;
	}
}
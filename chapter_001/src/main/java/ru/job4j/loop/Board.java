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
	 * @param width width.
	 * @param height height.
	 * @return result.
	 */
	public String paint(int width, int height) {
		StringBuilder sBuilder = new StringBuilder("");
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j <= width; j++) {
					if ((i + j) % 2 == 0) {
						sBuilder.append("x");
					} else {
						sBuilder.append(" ");
					}
				}
				sBuilder.append(System.getProperty("line.separator"));
			}
		return sBuilder.toString();
	}
}
package ru.job4j.loop;
/**
 * Class Paint.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 15.05.2017
 */
public class Paint {
	/**
	 * piramid.
	 * @param h h.
	 * @return sBuilder.
	 */
	public String piramid(int h) {
		StringBuilder sBuilder = new StringBuilder("");
			int width = h + (h - 1);
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= width; j++) {
					if (j <= h - i || j >= h + i) {
						sBuilder.append(" ");
					} else {
						sBuilder.append("^");
					}
				}
				sBuilder.append(System.getProperty("line.separator"));
			}
		return sBuilder.toString();
	}
}
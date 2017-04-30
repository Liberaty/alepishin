package ru.job4j.condition;
/**
 * Class Point.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 30.04.2017
 */
public class Point {
	/**
	 * x.
     * @see x
     */
    private int x;
	/**
	 * y.
     * @see y
     */
    private int y;
	/**
	 * Point.
     * @see Point
	 * @param x - x.
	 * @param y - y.
     */
    public  Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
	/**
     * getX.
	 * @return this.x
     */
	public int getX() {
      return this.x;
    }
	/**
     * getY.
	 * @return this.y
     */
    public int getY() {
     return this.y;
    }
	/**
     * Is.
     * @param a - int.
	 * @param b - int.
	 * @return boolean - boolean.
     */
	public boolean is(int a, int b) {
		return this.y * this.x == a * this.x + b ? true : false;
    }
}
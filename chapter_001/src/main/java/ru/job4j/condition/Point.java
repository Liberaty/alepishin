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
    private double x;
	/**
	 * y.
     * @see y
     */
    private double y;
	/**
	 * Point.
     * @see Point
	 * @param x - double.
	 * @param y - double.
     */
    public  Point(double x, double y) {
      this.x = x;
      this.y = y;
    }
	/**
     * getX.
	 * @return this.x
     */
	public double getX() {
      return this.x;
    }
	/**
     * getY.
	 * @return this.y
     */
    public double getY() {
     return this.y;
    }
	/**
     * Is.
     * @param a - double.
	 * @param b - double.
	 * @return boolean - boolean.
     */
	public boolean is(double a, double b) {
		return this.y == a * this.x + b;
    }
}
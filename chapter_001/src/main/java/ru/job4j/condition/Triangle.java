package ru.job4j.condition;
/**
 * Class Triangle.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 1
 * @since 30.04.2017
 */
public class Triangle {
	/**
	 * a.
     * @see a
     */
	private Point a;
	/**
	 * b.
     * @see b
     */
	private Point b;
	/**
	 * c.
     * @see c
     */
	private Point c;
	/**
	 * d1.
     * @see d1
     */
	private double d1;
	/**
	 * d2.
     * @see d2
     */
	private double d2;
	/**
	 * d3.
     * @see d3
     */
	private double d3;
	/**
	 * Triangle.
     * @see Triangle
	 * @param a - Point.
	 * @param b - Point.
	 * @param c - Point.
     */
	public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
	}
	/**
     * Caculate area.
	 * @return area - boolean.
     */
	public double area() {
		// calculate the triangle area
		double semiP = (d1 + d2 + d3) / 2;
		double area = Math.sqrt(semiP * (semiP - d1) * (semiP - d2) * (semiP - d3));
		return area;
	}
	/**
     * side1.
     * @param a - Point.
	 * @param b - Point.
	 * @return d1 - double.
     */
	public double side1(Point a, Point b) {
		d1 = Math.sqrt((2 * (b.getX() - a.getX())) + (2 * (b.getY() - a.getY())));
		return d1;
	}
	/**
     * side2.
     * @param b - Point.
	 * @param c - Point.
	 * @return d2 - double.
     */
	public double side2(Point b, Point c) {
		d2 = Math.sqrt((2 * (c.getX() - b.getX())) + (2 * (c.getY() - b.getY())));
		return d2;
	}
	/**
     * side3.
     * @param a - Point.
	 * @param c - Point.
	 * @return d3 - double.
     */
	public double side3(Point a, Point c) {
		d3 = Math.sqrt((2 * (c.getX() - a.getX())) + (2 * (c.getY() - a.getY())));
		return d3;
	}
	/**
     * compareSides.
	 * @return compareSides - boolean.
     */
	 public boolean compareSides() {
		return ((d1 < (d2 + d3)) || (d2 < (d1 + d3)) || (d3 < (d1 + d2)));
	 }
}
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
		double d1 = side(this.a, this.b);
		double d2 = side(this.b, this.c);
		double d3 = side(this.a, this.c);
		double semiP = (d1 + d2 + d3) / 2;
		double area = Math.sqrt(semiP * (semiP - d1) * (semiP - d2) * (semiP - d3));
		return area;
	}
	/**
     * side.
     * @param a - Point.
	 * @param b - Point.
	 * @return side - double.
     */
	 public double side(Point a, Point b) {
		return Math.sqrt((2 * (b.getX() - a.getX())) + (2 * (b.getY() - a.getY())));
	 }
	/**
     * compareSides.
	 * @return compareSides - boolean.
     */
	 public boolean compareSides() {
		double d1 = side(this.a, this.b);
		double d2 = side(this.b, this.c);
		double d3 = side(this.a, this.c);
		return ((d1 < (d2 + d3)) || (d2 < (d1 + d3)) || (d3 < (d1 + d2)));
	 }
}
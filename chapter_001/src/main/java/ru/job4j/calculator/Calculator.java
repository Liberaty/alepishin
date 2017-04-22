package ru.job4j.calculator;
/**
 * Calculator.
 *
 * @author Alexey Leishin (lepishin.ao@yandex.ru)
 * @version 2
 * @since 22.04.2017
 */
public class Calculator {
    /**
    * Result.
    * @see result
    */
    private double result;
    /**
     * Add.
     * @param first first number
     * @param second second number
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Substruct.
     * @param first first number
     * @param second second number
     */
    public void substruct(double first, double second) {
        this.result = first - second;
    }
    /**
     * Div.
     * @param first first number
     * @param second second number
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Multiple.
     * @param first first number
     * @param second second number
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Add.
     * @return this.result result
     */
    public double getResult() {
        return this.result;
    }
}
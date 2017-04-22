package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author Alexey Lepishin (lepishin.ao@yandex.ru)
* @version $Id$
* @since 22.04.2017
*/
public class CalculatorTest {
    /**
	* Test Add.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
	* Test Substruct.
	*/
    @Test
    public void whenSubstructTwoMinusOneThenOne {
        Calculator cal = new Calculator();
        calc.substruct(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
	* Test Div.
	*/
    @Test
    public void whenDivFourDivideTwoThenTwo {
        Calculator cal = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
	* Test Multiple.
	*/
    @Test
    public void whenMultipleTwoMultiplyTwoThenFour {
        Calculator cal = new Calculator();
        calc.multiple(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}
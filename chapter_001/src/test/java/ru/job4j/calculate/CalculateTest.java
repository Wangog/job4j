package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Class CalculateTest решение задачи 3.1. Элементарный калькулятор
*@author shcherbakov
*@since 07.02.2019
*@version 1.0.4
*/ 
public class CalculateTest {
	/**
	* Test сложение.
	*/
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculate calc = new Calculate();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
	/**
	 * Test вычитание.
	 */
	@Test
	public void whenSubtractOneToOneThenZero() {
		Calculate calc = new Calculate();
		calc.subtract(1D, 1D);
		double result = calc.getResult();
		double expected = 0D;
		assertThat(result, is(expected));
	}
	/**
	 * Test умножение.
	 */
	@Test
	public void whenMultipleTwoToTheeThenSix() {
		Calculate calc = new Calculate();
		calc.multiple(2D, 3D);
		double result = calc.getResult();
		double expected = 6D;
		assertThat(result, is(expected));
	}
	/**
	 * Test деление.
	 */
	@Test
	public void whenDivOneToOneThenOne() {
		Calculate calc = new Calculate();
		calc.div(1D, 1D);
		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(expected));
	}

}
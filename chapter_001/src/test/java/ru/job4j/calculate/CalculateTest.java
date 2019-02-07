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
		calc.add(1, 1);
		double result = calc.getResult();
		double expected = 2;
		assertThat(result, is(expected));
	}
	/**
	 * Test вычитание.
	 */
	@Test
	public void whenTwoSubtractOneThenOne() {
		Calculate calc = new Calculate();
		calc.add(2, 1);
		double result = calc.getResult();
		double expected = 3;
		assertThat(result, is(expected));
	}
	/**
	 * Test умножение.
	 */
	@Test
	public void whenMultipleTwoOnTwoThenOne() {
		Calculate calc = new Calculate();
		calc.add(2, 2);
		double result = calc.getResult();
		double expected = 4;
		assertThat(result, is(expected));
	}
	/**
	 * Test деление.
	 */
	@Test
	public void whenDivTwoOnTwoThenOne() {
		Calculate calc = new Calculate();
		calc.add(2, 2);
		double result = calc.getResult();
		double expected = 4;
		assertThat(result, is(expected));
	}

}
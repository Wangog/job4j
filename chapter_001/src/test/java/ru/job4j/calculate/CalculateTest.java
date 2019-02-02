package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Class CalculateTest решение задачи 3.1. Элементарный калькулятор
*@author shcherbakov
*@since 02.02.2019
*@version 1.0
*/ 
public class CalculateTest {
	/**
	* Test сложение.
	*/
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculate calc = new Calculate();
		calc.add(0,2);
		double result=calc.getResult();
		double expected=2;
		assertThat(result,is(expected));
	}

}
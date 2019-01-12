package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Class CalculateTest решение задачи 1.4. JUnit
*@author shcherbakov
*@since 12.01.2019
*@version 1.0
*/ 
public class CalculateTest {
	/**
	* Test echo.
	*/
	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
		String input = "summa";
		String expect = "Echo, echo, echo:summa";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
}
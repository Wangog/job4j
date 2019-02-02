package ru.job4j.calculate;
/**
*Class Calculate решение задачи 3.1 Элементарный клькулятор
*@author shcherbakov
*@since 02.02.2019
*@version 1.0.1
*/ 
public class Calculate {
	private double result;
	/**
	 * Описываем аргументы first и second.
	 * Опыисываем действия аргументов.
	 */
	public void add(double first, double second) {
		this.result = first + second;
		this.result = first - second;
		this.result = first * second;
		this.result = first / second;
    }
	/**
	*Выводим полученный результат.
	*/
	public double getResult() {
		return this.result;
	}
}
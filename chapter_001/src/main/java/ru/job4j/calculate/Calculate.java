package ru.job4j.calculate;
/**
*Class Calculate решение задачи 3.1 Элементарный клькулятор
*@author shcherbakov
*@since 07.02.2019
*@version 1.0.4
*/ 
public class Calculate {
	private double result;
	/**
	 * Описываем аргументы first и second.
	 * Опыисываем действия сложения.
	 */
	public void add(double first, double second) {
		this.result = first + second;
    }
    /**
     * Опыисываем действия вычитания.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Опыисываем действия умножения.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Опыисываем действия деления.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Возвращае результат.
     * @return Сумму.
     */
    public double getResult() {
        return this.result;
    }
}
package ru.job4j.calculate;
/**
*Class Calculate решение задачи 3.1 Элементарный клькулятор
*@author shcherbakov
*@since 05.02.2019
*@version 1.0.3
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
     *Выводим полученный результат сложения.
     */
    public double getResult() {
        return this.result;
    }
    /**
     * Описываем аргументы three и four.
     * Опыисываем действия вычитания.
     */
    public void min(double three, double four) {
        this.result = three - four;
    }
    /**
     *Выводим полученный результат вычитания.
     */
    public double getResultMin() {
        return this.result;
    }
    /**
     * Описываем аргументы five и six.
     * Опыисываем действия умножения.
     */
    public void mult(double five, double six) {
        this.result = five * six;
    }
    /**
     *Выводим полученный результат умножения.
     */
    public double getResultUmn() {
        return this.result;
    }
    /**
     * Описываем аргументы seven и eight.
     * Опыисываем действия диления.
     */
    public void div(double seven, double eight) {
        this.result = seven / eight;
    }
    /**
     *Выводим полученный результат деления.
     */
    public double getResultDiv() {
        return this.result;
    }
}
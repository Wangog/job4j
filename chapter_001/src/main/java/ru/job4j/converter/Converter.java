package ru.job4j.converter;
/**
 *Class Converter решение задачи 3.2. Конвертер валюты
 *@author shcherbakov
 *@since 16.02.2019
 *@version 1.0.0
 */
public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        value = value / 70;
        return value;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары.
     */
    public int rubleToDollar(int value) {
        value = value / 60;
        return value;
    }
    /**
     * Конвертируем Евро в рубли.
     * @param value рубли.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        value = value * 70;
        return value;
    }
    /**
     * Конвертируем доллары в рубли.
     * @param value рубли.
     * @return Рубли.
     */
    public int dollarToRuble(int value) {
        value = value * 60;
        return value;
    }
}
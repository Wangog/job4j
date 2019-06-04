package ru.job4j.loop;
/**
 *Class Factorial решение задачи 5.2. Создать программу вычисляющую факториал
 *@author shcherbakov
 *@since 04.06.2019
 *@version 1.0.0
 */

public class Factorial {
    /**
    *@param n - число факториала
    */
    public int calc(int n) {
        int result = 1;
        for (int index = 1; index <= n; index++) {
            result *= index;
            }
        return result;
    }
}
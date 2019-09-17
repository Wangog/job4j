package ru.job4j.array;
/**
 *Class Square решение задачи 6.0. Заполнить массив степенями чисел.
 *@author shcherbakov
 *@since 16.09.2019
 *@version 1.0.0
 */

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int value = 0; value != rst.length; value++) {
            rst [value] = (int) Math.pow((value + 1), 2);
        }
        return rst;
    }
}
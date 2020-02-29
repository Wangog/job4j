package ru.job4j.array;
/**
 *Class Min решение задачи 6.5.1. Поиск минимального числа в массиве.
 *@author shcherbakov
 *@since 29.02.2020
 *@version 1.0.0
 */

public class Min {
    public static int findMin(int[] array) {
        int min = array[0]; //создаем масив
        for (int index = 0; index < array.length; index++) { //заполняем масив
            if (min > array[index]){ //проверяем масив сравнивая число в масиве и число минимум
                min = array[index]; //заменяем при равенстве
            }
        }
        return min;
    }
}
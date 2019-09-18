package ru.job4j.array;
/**
 *Class Turn решение задачи 6.2. Перевернуть массив.
 *@author shcherbakov
 *@since 18.09.2019
 *@version 1.0.0
 */

public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i > array.length - i - 1; i++) {
            array [i] = i + 1;
        }
        return array;
    }
}
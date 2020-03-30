package ru.job4j.array;
/**
 *Class Matrix решение задачи 6.6. Двухмерный массив. Таблица умножения.
 *@author shcherbakov
 *@since 30.03.2020
 *@version 1.0.0
 */

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j++) {
             table [i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
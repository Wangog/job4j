package ru.job4j.array;
/**
 *Class BubbleSort решение задачи 6.5. Создать программу для сортировки массива методом перестановки.
 *@author shcherbakov
 *@since 16.11.2019
 *@version 1.0.0
 */

public class BubbleSort {
    public int sort(int[] array) {
        int result;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
              if (array[j] > array[j + 1]) {
                int tmp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = tmp;
                result = tmp;
              }
            }
        }
        return result;
    }
}

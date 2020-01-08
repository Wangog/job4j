package ru.job4j.array;
/**
 *Class BubbleSort решение задачи 6.5. Создать программу для сортировки массива методом перестановки.
 *@author shcherbakov
 *@since 06.01.2020
 *@version 1.0.4
 */

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int i;
        boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву
        int temp;   // вспомогательная переменная
        while (flag) { //Всегда используем для пузырька while?
            flag = false;    // устанавливаем флаг в false в ожидании возможной замены местами
            for (i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) { // измените на < для сортировки по убыванию
                    temp = array[i];         // меняем элементы местами
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
                if (flag) {
                    break;
                }
            }
        }
    }
}

package ru.job4j.array;
/**
 *Class FindLoop решение задачи 6.5. Поиск индекса в диапазоне.
 *@author shcherbakov
 *@since 07.12.2019
 *@version 1.0.0
 */

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = -1; start <= finish; start++) { //
            if (data[start] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
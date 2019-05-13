package ru.job4j.loop;
/**
 *Class Counter решение задачи 5.1. Подсчет суммы чётных чисел в диапазоне
 *@author shcherbakov
 *@since 13.05.2019
 *@version 1.0.0
 */

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (int z = start; z <= finish; z++) {
            if (z % 2 == 0);
            z++;
        }
        return sum;
    }
}

package ru.job4j.array;
/**
 *Class Check решение задачи 6.3. Массив заполнен true или false.
 *@author shcherbakov
 *@since 16.11.2019
 *@version 1.0.4
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
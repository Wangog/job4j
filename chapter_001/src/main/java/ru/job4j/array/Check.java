package ru.job4j.array;
/**
 *Class Turn решение задачи 6.3. Массив заполнен true или false.
 *@author shcherbakov
 *@since 11.11.2019
 *@version 1.0.3
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        int i = 1; //Цыкл пускаю с 1 индекса
        for (; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
            }
        }
        return result;
    }
}
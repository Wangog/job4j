package ru.job4j.array;
/**
 *Class Turn решение задачи 6.3. Массив заполнен true или false.
 *@author shcherbakov
 *@since 27.10.2019
 *@version 1.0.0
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
           if (data[i] != true)
               result = false;
      }
        return result;
    }
}
package ru.job4j.array;
/**
 *Class Turn решение задачи 6.3. Массив заполнен true или false.
 *@author shcherbakov
 *@since 02.11.2019
 *@version 1.0.1
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true; // в задаче тут указано FALSE, получение положительного решения не поменяв значения у меня не вышло
        int i = 0;
        boolean temp = data[i]; //как обойтись без ввода дополнительной переменной булиан?
        for (; i < data.length; i++) {
            if (data[i] != temp) {
                result = false;
            }
        }
        return result;
    }
}
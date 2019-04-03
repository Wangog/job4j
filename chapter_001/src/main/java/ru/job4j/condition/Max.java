package ru.job4j.condition;
/**
 *Class Max решение задачи 4.2. Максимм из двух чисел
 *@author shcherbakov
 *@since 03.04.2019
 *@version 1.0.0
 */

public class Max {
    /**
     * Максимальное из двух чисел.
     * @param first первое число.
     * @param second второе число.
     * @return значение больше меньше или равно.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
}
package ru.job4j.condition;
/**
 *Class Max решение задачи 4.4. Максимм из трех чисел
 *@author shcherbakov
 *@since 13.04.2019
 *@version 1.0.0
 */
public class MultiMax {
    /**
     * Максимальное из двух чисел.
     *
     * @param first  первое число.
     * @param second второе число.
     * @return значение больше меньше или равно.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
    /**
     * Максимальное из трех чисел.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @return наибольшее из трех чисел.
     */
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}
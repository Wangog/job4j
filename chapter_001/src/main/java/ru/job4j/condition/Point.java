package ru.job4j.condition;
/**
 *Class Point решение задачи 3.4. Расстояние между точками в системе координат
 *@author shcherbakov
 *@since 05.03.2019
 *@version 1.0.1
 */
public class Point {
    /**
     * Прописываем параметры x1, x2, y1, y2
     * Добавлем два пораметра действий в скобках pow1, pow2.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double pow1 = x1 - x2;
        double pow2 = y1 - y2;
        double result = Math.sqrt(Math.pow(pow1, 2) + Math.pow(pow2, 2));
        return result;
    }
}
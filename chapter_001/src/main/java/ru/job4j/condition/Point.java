package ru.job4j.condition;

public class Point {
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2) + Math.pow(y1 - y2));
    }
}
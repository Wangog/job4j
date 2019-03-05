package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 *Class PointTest решение задачи 3.4. Расстояние между точками в системе координат
 *@author shcherbakov
 *@since 05.03.2019
 *@version 1.0.1
 */
public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}
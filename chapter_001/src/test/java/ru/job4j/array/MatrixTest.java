package ru.job4j.array;
/**
 *Class Matrix решение задачи 6.6. Двухмерный массив. Таблица умножения.
 *@author shcherbakov
 *@since 30.03.2020
 *@version 1.0.0
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
}
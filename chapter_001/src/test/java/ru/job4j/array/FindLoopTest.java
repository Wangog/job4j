package ru.job4j.array;
/**
 *Class FindLoopTest решение задачи 6.1. Классический поиск перебором.
 *@author shcherbakov
 *@since 17.09.2019
 *@version 1.0.0
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
}
package ru.job4j.array;
/**
 *Class FindLoopTest решение задачи 6.1. Классический поиск перебором.
 *@author shcherbakov
 *@since 17.09.2019
 *@version 1.0.1
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
    @Test //поиск конца масива
    public void whenArrayHas7ThisEndArray() {
        FindLoop findend = new FindLoop();
        int[] input = new int[] {9, 4, 7};
        int value = 7;
        int result = findend.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test //поиск числа которого нет в масиве
    public void whenArrayNotHave7() {
        FindLoop findnot = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 4;
        int result = findnot.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
}
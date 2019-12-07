package ru.job4j.array;
/**
 *Class FindLoopTest решение задачи 6.5. Поиск индекса в диапазоне.
 *@author shcherbakov
 *@since 07.12.2019
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
    @Test //поиск конца масива
    public void whenArrayHas7ThisEndArray() {
        FindLoop findend = new FindLoop();
        int[] input = new int[] {3, 4, 7};
        int value = 7;
        int result = findend.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }
    @Test //поиск числа которого нет в масиве
    public void whenArrayNotHave7() {
        FindLoop findnot = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 4;
        int result = findnot.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind4() {
        int[] input = new int[] {4, 3, 5, 1, 2, 10};
        int value = 2;
        int start = 4;
        int finish = 10;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind2() {
        int[] input = new int[] {2, 3, 1, 4, 8, 10};
        int value = 1;
        int start = 2;
        int finish = 8;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }
}
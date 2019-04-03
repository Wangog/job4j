package ru.job4j.condition;
/**
 *Class MaxTest решение задачи 4.2. Максимм из двух чисел
 *@author shcherbakov
 *@since 03.04.2019
 *@version 1.0.0
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxFirstToSecondThenSecond() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstEqualsSecond() {
        Max max = new Max();
        int result = max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenSecondMaxThanFirst() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
}
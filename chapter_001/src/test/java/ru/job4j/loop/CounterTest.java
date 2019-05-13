package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class CounterTest решение задачи 5.1. Подсчет суммы чётных чисел в диапазоне
 *@author shcherbakov
 *@since 13.05.2019
 *@version 1.0.0
 */

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter count = new Counter();
        int result = count.add(1, 10);
        assertThat(result, is(30));
    }
}


package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 *Class Max решение задачи 4.4. Максимм из трех чисел
 *@author shcherbakov
 *@since 12.04.2019
 *@version 1.0.0
 */

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
}
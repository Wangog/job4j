package ru.job4j.array;
/**
 *Class Turn решение задачи 6.3. Массив заполнен true или false.
 *@author shcherbakov
 *@since 16.11.2019
 *@version 1.0.4
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    public void whenDataNotMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataNotMonoByTwoTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
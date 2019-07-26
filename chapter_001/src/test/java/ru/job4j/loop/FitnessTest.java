package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 *Class FitnessTest решение задачи 5.4. Протеиновая диета
 *@author shcherbakov
 *@since 25.07.2019
 *@version 1.0.0
 */

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        Fitness fit = new Fitness();
        int days = fit.calc(95, 90);
        assertThat(days, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        Fitness fit = new Fitness();
        int days = fit.calc(90, 95);
        assertThat(days, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        Fitness fit = new Fitness();
        int days = fit.calc(50, 90);
        assertThat(days, is(2));
    }
}
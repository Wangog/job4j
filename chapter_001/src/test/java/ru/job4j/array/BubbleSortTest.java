package ru.job4j.array;
/**
 *Class BubbleSortTest решение задачи 6.5. Создать программу для сортировки массива методом перестановки.
 *@author shcherbakov
 *@since 06.01.2020
 *@version 1.0.4
 */

        import org.junit.Test;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        BubbleSort.bubbleSort(array);
        int[] ex = {0, 1, 1, 2, 3, 4, 5, 5, 7,8};
        assertThat(array, is(ex));
        }
    }


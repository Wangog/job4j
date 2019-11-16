package ru.job4j.array;
/**
 *Class BubbleSortTest решение задачи 6.5. Создать программу для сортировки массива методом перестановки.
 *@author shcherbakov
 *@since 16.11.2019
 *@version 1.0.0
 */

        import org.junit.Test;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int result = BubbleSort.sort(array);
    }
}


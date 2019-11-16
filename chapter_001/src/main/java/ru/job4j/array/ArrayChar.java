package ru.job4j.array;
/**
 *Class ArrayChar решение задачи 6.4. Слово начинается с ....
 *@author shcherbakov
 *@since 16.11.2019
 *@version 1.0.2
 */

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
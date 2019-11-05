package ru.job4j.array;
/**
 *Class Turn решение задачи 6.4. Слово начинается с ....
 *@author shcherbakov
 *@since 02.11.2019
 *@version 1.0.0
 */

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            if (word[1] != pref[1])
            result = false;
        }
        return result;
    }
}
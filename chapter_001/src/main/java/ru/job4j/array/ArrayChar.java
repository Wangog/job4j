package ru.job4j.array;
/**
 *Class Turn решение задачи 6.4. Слово начинается с ....
 *@author shcherbakov
 *@since 11.11.2019
 *@version 1.0.1
 */

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            if (word[i] != pref[i])
            result = false;
            break;
        }
        return result;
    }
}
package ru.job4j.loop;
/**
 *Class Fitness решение задачи 5.4. Протеиновая диета
 *@author shcherbakov
 *@since 21.07.2019
 *@version 1.0.0
 */

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) { //Условие входа в цыкл
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
package ru.job4j.array;
/**
 *Class MatrixCheck решение задачи 	6.7. Квадратный массив заполнен true или false по диагоналям.
 *@author shcherbakov
 *@since 06.07.2020
 *@version 1.0.2
 */

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = true;
        int gd = 0; //Горизонтальная диагональ
        int vd = 0; //Вертикальная диагональ
        for (int i = 0; i < board.length - 1; i++) {
            if (board[i][i] == board[i + 1][i + 1]) {
                gd++;
            }
            if (board[board.length - 1][board.length - 1] == board[board.length - 1 - i][board.length - 1 - i]) {
                vd++;
            }
        }
            if (gd == board.length - 1 || vd == board.length - 1)
        return result;
    }
}
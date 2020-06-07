package ru.job4j.array;
/**
 *Class MatrixCheck решение задачи 	6.7. Квадратный массив заполнен true или false по диагоналям.
 *@author shcherbakov
 *@since 07.06.2020
 *@version 1.0.1
 */

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = true;
        int GD = 0; //Горизонтальная диагональ
        int VD = 0; //Вертикальная диагональ
        for (int i = 0; i < board.length - 1; i++) {
            if (board[i][i] == board[i + 1][i + 1]) {
                GD++;
            }
            if (board[board.length - 1][board.length - 1] == board[board.length - 1 - i][board.length - 1 - i]) {
                VD++;
            }
        }
            if (GD == board.length - 1 || VD == board.length - 1);
        return result;
    }
}
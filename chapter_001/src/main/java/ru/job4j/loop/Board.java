/**
 *Class Board решение задачи 5.3. Построить шахматную доску в псевдографики
 *@author shcherbakov
 *@since 21.07.2019
 *@version 1.0.0
 */
public class Board {
    /**
     * Метод рисует шахматную доску из символов X и пробелов
     *
     * @param width ширина доски.
     * @param height высота доски.
     * @return возвращает все X и пробелы
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                  if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
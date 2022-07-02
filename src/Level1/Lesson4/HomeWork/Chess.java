package Level1.Lesson4.HomeWork;

//Вывести шахматную доску, с переменными ширина и высота. Например с
//        шириной 7 и высотой 5, выглядеть будет вот так:
//        Подсказка: сумма i, j для “X” чётная, а для пробелов нечётная.
public class Chess {
    public static void main(String[] args) {
        int width = 7;
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

}

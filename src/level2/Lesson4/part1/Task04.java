package level2.Lesson4.part1;

import java.util.Arrays;

//Необходимо создать программу,
// которая будет заполнять массив числами, возведенными в квадрат.
// В методе передаётся параметр bound.
// Он определяет, до какого  числа нужно записывать числа.
// Например, если задается bound = 3, нужно возвести в квадрат числа 0, 1 и 2 и записать в массив числа 0, 1, 4.
public class Task04 {
    public static void main(String[] args) {
        int bound =4;
        System.out.println(Arrays.toString(squareNumbers(bound)));
    }
    static int[] squareNumbers(int bound){
        int[] squareNum = new int[bound];
        for (int i = 0; i < bound; i++) {
            squareNum[i] = i*i;
        }
        return squareNum;
    }
}

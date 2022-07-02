package level2.Lesson4.part1;

import java.util.Arrays;
import java.util.Random;

//Создать массив чисел размером 20,
// написать метод,
// который принимает массив и
// возвращает среднее арифметическое элементов массива.
public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(average(array));
    }

    static double average(int[] array) {
        double average = 0;
        for (int result : array) {
            average += result;
        }
        /*for (int i = 0; i < array.length; i++) {
            result += array[i];
        }*/
        System.out.println(average);
        return average / (array.length);
    }
}

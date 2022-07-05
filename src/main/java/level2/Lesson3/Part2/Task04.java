package level2.Lesson3.Part2;

import java.util.Arrays;
import java.util.Random;

//Создать массив размером 15,
// написать метод, который принимает массив и возвращает сумму всех чисел этого массива.
public class Task04 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sumArray(array));
    }

    static int sumArray(int[] array) {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

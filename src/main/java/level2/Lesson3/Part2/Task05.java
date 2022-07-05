package level2.Lesson3.Part2;

import java.util.Arrays;
import java.util.Random;

//Создать массив, размером 30 со случайными значениями чисел.
// Заменить каждый элемент массива с нечетным индексом на ноль.
public class Task05 {
    public static void main(String[] args) {
        int[] array = new int[30];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = i % 2 == 0 ? 0 : array[i];
        }
        System.out.println(Arrays.toString(array));
    }

}

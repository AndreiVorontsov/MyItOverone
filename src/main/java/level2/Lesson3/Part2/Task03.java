package level2.Lesson3.Part2;

import java.util.Arrays;
import java.util.Random;

//Создать массив размером 10, заполнить его случайными числами в диапазоне от 0 до 20.
// Затем в зависимости от чётности/нечётности индекса поменять значение у числа,
// если индекс четный до число поменять значение на отрицательное.
public class Task03 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = i % 2 == 0 ? -array[i] : array[i];
        }
        System.out.println(Arrays.toString(array));
    }
}

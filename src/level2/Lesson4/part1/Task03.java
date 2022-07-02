package level2.Lesson4.part1;

import java.util.Arrays;
import java.util.Random;

//Создать массив чисел размером 25,
// создать метод,
// который принимает массив
// и возвращает массив из четных элементов первого массива.
public class Task03 {
    public static void main(String[] args) {
        int[] array = new int[25];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(evenArray(array)));
    }

    static int[] evenArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        int[] evenArray = new int[count];
        //System.out.println(count);
        int index=0;
        for (int number: array) {
            if (number % 2 == 0){
                evenArray[index]=number;
                index++;
            }
        }
        return evenArray;
    }
}

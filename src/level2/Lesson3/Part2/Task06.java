package level2.Lesson3.Part2;

import java.util.Arrays;
import java.util.Random;

//Создать 2 массива размером 10 и 15, заполнить случайным значениями.
// Создать метод, который на вход принимает оба массива, а возвращает новый массив,
// который объединяет 1 и 2 массив. В методе main проверить работу метода.
public class Task06 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[5];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(integrateArray(array1, array2)));


    }

    static int[] integrateArray(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i < array1.length ? array1[i] : array2[i - array1.length];
        }
        return newArray;
    }
}

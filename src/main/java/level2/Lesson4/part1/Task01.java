package level2.Lesson4.part1;

import java.util.Arrays;
import java.util.Random;

//Написать метод, который принимает массив и число,
// метод должен найти это число в массиве и вернуть его индекс,
// если такого числа нет, то метод должен вернуть -1.
public class Task01 {
    public static void main(String[] args) {
        int[] array1 = new int[30];
        int[] array2 = {2,3,234,3556,4,5,67,86,3};
        int number = 5;
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(searchNumber(array2, number));
    }

    static int searchNumber(int[] array, int number) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                result = i;
                break;
            }
        }
        return result;
    }
}

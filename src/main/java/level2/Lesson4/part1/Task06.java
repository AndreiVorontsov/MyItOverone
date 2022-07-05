package level2.Lesson4.part1;

import java.util.Arrays;

//Написать метод, который принимает массив и два числа.
// Два числа это два индекса этого массива,
// метод должен поменять местами эл-ты по переданным индексам.
// В методе main у вас должен быть массив {5, 3, 2, 1, 4},
// в main вызывайте свой метод столько раз,
// пока массив не будет полностью отсортированным.
public class Task06 {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 1, 4};
        System.out.println(Arrays.toString(array));
        sortArray(array, 3, 0);
        sortArray(array, 2, 1);
        sortArray(array, 4, 3);
        System.out.println(Arrays.toString(array));

    }

    static void sortArray(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

}

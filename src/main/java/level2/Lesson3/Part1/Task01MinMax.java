package level2.Lesson3.Part1;

//Создать массив размером 20, заполнить случайными числами.
// Написать 2 метода, которые принимают массив и 1 метод возвращает минимальное,
// 2 метод возвращает максимальное число этого массива.
public class Task01MinMax {
    public static void main(String[] args) {
        int[] Array = new int[20];

        java.util.Random generator = new java.util.Random();
        for (int i = 0; i < Array.length; i++) {
            Array[i] = generator.nextInt(100);
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        System.out.println(min(Array));
        System.out.println(max(Array));
    }

    static int min(int[] Array) {
        int min = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < min) {
                min = Array[i];
            }
        }
        return min;
    }

    static int max(int[] Array) {
        int max = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        return max;
    }
}

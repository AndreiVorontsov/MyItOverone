package level2.Lesson5_String.part2;
//Дана строка “1, 25, 32, 100, 15, 7”.
// Написать 2 метода, которые принимают в качестве аргумента строку.
// 1й метод возвращает минимальное число из этой строки,
// а 2й метод возвращает сумму чисел в этой строке.
public class Task03 {
    public static void main(String[] args) {
        String string = "1, 25, 32, 100, 15, 7";
        System.out.println("минимальное число из строки - " + minOfString(string));
        System.out.println("сумму чисел в строке - " + sumOfString(string));
    }
    static int minOfString(String string){
        String[] strings = string.split(", ");
        int min = Integer.parseInt(strings[0]);
        for (int i = 0; i < strings.length; i++) {
            int x = Integer.parseInt(strings[i]);
            if (x < min){
                min = x;
            }

        }
        return min;
    }
    static int sumOfString(String string){
        String[] strings = string.split(", ");
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            int x = Integer.parseInt(strings[i]);
            sum += x;
        }
        return sum;
    }
}

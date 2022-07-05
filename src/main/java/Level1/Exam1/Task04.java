package Level1.Exam1;
//Даны два целых числа A и B (A < B).
// Найти сумму всех целых чисел от A до B включительно.
public class Task04 {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        System.out.println(result);
    }
}

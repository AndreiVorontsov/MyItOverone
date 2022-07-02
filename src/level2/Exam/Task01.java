package level2.Exam;

//1. Написать метод, который возвращает сумму чисел от 1 до 5.
public class Task01 {
    public static void main(String[] args) {
        System.out.println(sumOneFive());
    }

    static int sumOneFive() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }
}

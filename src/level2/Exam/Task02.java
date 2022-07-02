package level2.Exam;

//2. Написать метод, который возвращает среднее арифметическое от 1 до 9.
public class Task02 {
    public static void main(String[] args) {
        System.out.println(averageOneNine());
    }

    static double averageOneNine() {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum += i;
        }
        return (double) sum / 9;
    }
}

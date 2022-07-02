package level2.Exam;

//Написать метод, который получает 2 числа и возвращает разницу между ними.
//Например(2,7), разница 5, 2й пример(7,2), разница тоже 5. Метод возвращает только положительное число.
public class Task03 {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 7;
        System.out.println(differenceNumbers(number1, number2));
    }

    static int differenceNumbers(int number1, int number2) {
        int dif = 0;
        dif = Math.abs(number1 - number2);
//        if (dif < 0) {
//            dif = -1 * dif;
//        }
        return dif;
    }
}

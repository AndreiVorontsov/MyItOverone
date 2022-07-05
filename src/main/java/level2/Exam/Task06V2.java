package level2.Exam;

public class Task06V2 {
    public static void main(String[] args) {
        int number1 = 11;
        int number2 = 22;
        System.out.println("Наибольший общий делитель чисел " + number1 + " и " + number2 + " равен " + findMaxDivisor (number1, number2));
    }

    private static int findMaxDivisor(int number1, int number2) {
        int maxDivisor;
        int tmpbox;

        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);
        while (true) {
            if (max % min != 0) {
                tmpbox = min;
                min = max % min;
                max = tmpbox;
            }
            else {
                maxDivisor = min;
                break;
            }
        }

        return maxDivisor;
    }
}

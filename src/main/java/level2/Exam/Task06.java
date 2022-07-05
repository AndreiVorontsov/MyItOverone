package level2.Exam;

//6*. Написать метод, который принимает 2 числа и возвращает наибольший общий делитель для обоих чисел.
public class Task06 {
    public static void main(String[] args) {
        int a = 64;
        int b = 28;
        System.out.println(maxDivider(a,b));
    }

    static int maxDivider(int a, int b) {
        int divider = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a%i ==0 && b%i ==0){
                divider = i;
            }
        }
        return divider;
    }
}

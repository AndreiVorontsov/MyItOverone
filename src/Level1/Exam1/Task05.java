package Level1.Exam1;
//Дано целое число N (> 0).
// Используя операции деления нацело и взятия остатка от деления,
// найти число, полученное при прочтении числа N  справа налево.
public class Task05 {
    public static void main(String[] args) {
        int r = 3267;
        int n = r;
        int count = 1;
        String result = "";
        while (n / 10 != 0) {
            int x = n;
            n /=10;
            int y = x%(n*10);
            result = result + y;
            count++;
        }
        int w =1;
        for (int i = 1; i < count ; i++) {
           w *=10;
        }
        int q = r/w;
        result = result +q;
        System.out.println("исходное число " + r + "\nс права на лево " + result);
    }
}

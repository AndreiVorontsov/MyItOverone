package Level1.Exam1;

public class Task08 {
    //Дано целое число N (> 0).
// Используя операции деления нацело и взятия остатка от деления,
// найти число, полученное при прочтении числа N  справа налево.
        public static void main(String[] args) {
            int n =8756987;
            int initial = n ;
            int r =  n;
            int count = 1;
            int result=0;
            while (r / 10 != 0) {
                r /=10;
                count++;
            }
            int c=count;
            for (int i = 0; i < count; i++) {
                if (n/10 != 0) {
                    int y = n%((n / 10) * 10);
                    int w = 1;
                    for (int j = 1; j < c; j++) {
                        w *= 10;
                    }
                    c--;
                    int t = y * w;
                    result += t;
                    n = (n - y) / 10;
                }else {result += n;}
            }
            System.out.println("исходное число " + initial + "\nс права на лево " + result);
        }
    }


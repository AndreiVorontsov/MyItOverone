package Level1.Lesson4.HomeWork;

//Факториал натурального числа n:
// определяется как произведение всех натуральных чисел от 1 до n включительно
// n! = 1*2*3*....(n-1)*n
public class Factorialis {
    public static void main(String[] args) {
        int n = 6;
        int factorialis = 1;
        for (int i = 1; i <= n; i++) {
            factorialis *= i;
        }
        System.out.println(n + "! = " + factorialis);
    }
}

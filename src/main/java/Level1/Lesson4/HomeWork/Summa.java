package Level1.Lesson4.HomeWork;
//Написать программу, которая будет подсчитывать сумму чисел от start до finish.
//        Например, start = 0, finish = 5. Нужно сложить числа: 0, 1, 2, 3, 4, 5. Ответ будет
//        15. В конце программы сделать вывод суммы.
public class Summa {
    public static void main(String[] args) {
        int finish = 5;
        int result = 0;
        for ( int start = 0; start <= finish ; start++) {
            result += start;
        }
        System.out.println("сумма чисел от start до finish = " + result);
    }
}

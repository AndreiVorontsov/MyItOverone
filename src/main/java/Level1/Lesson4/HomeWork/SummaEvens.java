package Level1.Lesson4.HomeWork;
//Вычислять сумму четныx чисел в диапазоне от start до finish;
public class SummaEvens {
    public static void main(String[] args) {
        int finish = 6;
        int result = 0;
        for ( int start = 3; start <= finish ; start++) {
            if (start % 2 == 0){
            result += start;
            }
        }
        System.out.println("сумма четных чисел от start до finish = " + result);
    }
}

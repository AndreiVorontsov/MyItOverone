package Level1.Exam1;

//Дано целое число N (> 0).
//Используя операции деления нацело и взятия остатка от деления,
//найти количество и сумму его цифр.
public class Task09 {
    public static void main(String[] args) {

        int n = 8756987;
        int initial = n;
        int r = n;
        int count = 1;
        int summa = 0;
        while (r / 10 != 0) {
            r /= 10;
            count++;
        }
        int c = count;
        for (int i = 0; i < count; i++) {
            int y;
            if (n>=10){
                y = n%((n / 10) * 10);
            }else {y = n;}
            summa += y;
            n = (n - y) / 10;
        }
        System.out.println("исходное число " + initial + "\nколичество " + count + "\nсумма чисел " + summa);
    }
}






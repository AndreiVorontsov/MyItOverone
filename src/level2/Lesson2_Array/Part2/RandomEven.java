package level2.Lesson2_Array.Part2;
//=================
//Создать массив размером 15, заполнить его случайными числами.
// Затем вывести массив на экран. Запустить несколько раз и увидеть,
// что каждый раз массив заполнен разными значениями.

import java.util.Scanner;

public class RandomEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Для старта введите число - ");
        int cheater = scanner.nextInt();
        java.util.Random generator = new java.util.Random();
//        int[] numbers = new int[1];
//        for (int i = 0; i < numbers.length ; i++) {
//                numbers[i] = generator.nextInt(100);
//        }
//        for (int num :numbers){
//            System.out.println(num);
//        }
        int number = 0;
        int count = 1;
        int cheaterCount = cheater;
        while (cheaterCount / 10 != 0) {
            cheaterCount /= 10;
            count++;
        }
        if (3 == count) {
            number = Cheat(count, cheater, 2,true);
        } else if (4 == count){
            number = Cheat(count,cheater,7,false);
        } else {
            number = generator.nextInt(100);
        }
        // System.out.println(count);
        /* if (3 == count){
            for (int i = 0; i < count; i++) {
                int cheat = cheater%10;
                if (cheat == 3) {
                    for (int j = 0; j < 20; j++) {
                        number = generator.nextInt(100);
                        if (number%2==0){
                            j = 21;
                        }
                    }
                  i = count;
                } else {
                    number = generator.nextInt(100);
                }
                 cheater /=10;
            }
        } else if (4 == count){
        for (int i = 0; i < count; i++) {
            int cheat = cheater % 10;
            if (cheat == 5) {
                for (int j = 0; j < 20; j++) {
                    number = generator.nextInt(100);
                    if (number % 2 > 0) {
                        j = 21;
                    }
                }
                i = count;
            }else {
                number = generator.nextInt(100);
            }
            cheater /=10;
        }
        }else {
            number = generator.nextInt(100);
        }*/
        System.out.println("число  " + number);
    }

    /**
     * Метод Cheat возвращает четное или не четное число в зависимости от условий.
     * Можно задать число из опредененного числа цифр седержащие секредную цифру которое будет выводить нужно число,
     * если введено иной число то выводит случайное число.
     * @param count - определяет число циифр в числе
     * @param cheater - число введенное с консоли
     * @param cheatNumber - секредная цифра которая должна содержаться в числе
     * @param even - определяет получится результат четным(true) или нечетным(false)
     * @return
     */
    static int Cheat(int count, int cheater, int cheatNumber,boolean even) {
        java.util.Random generator = new java.util.Random();
        int number = 0;
        for (int i = 0; i < count; i++) {
            int cheat = cheater % 10;
            if (cheat == cheatNumber) {
                for (int j = 0; j < 20; j++) {
                    number = generator.nextInt(100);
                    if (number % 2 == 0 && even == true ) {
                        j = 21;
                    }else if (number % 2 != 0 && even == false){
                        j = 21;
                    }
                }
                i = count;
            } else {
                number = generator.nextInt(100);
            }
            cheater /= 10;
        }
        return number;
    }
}

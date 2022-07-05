package Level1.Lesson4.Part1;

//Создать цикл от 10 до 100, вывести на экран текущий счётчик.
//        * цикл от 110 до 10.
//        ** с шагом 7.
public class ForTask1 {
    public static void main(String[] args) {

        for (int counter = 110; counter > 10; counter -= 7) {
            System.out.println(counter);
            // для циклов часто используют i , j, k , быстро создать fori
        }
    }
}

package Level1.lesson3.part1;

public class IfElseExample2 {
    public static void main(String[] args) {
       /*создать новый класс
создать переменную money, записать туда любое значение от 0 до 1000.
использовать “if else” добавить проверку, если количество денег больше 100, то вывести на экран “Я иду в магазин.”
в противоположном случае должен быть вывод “Я никуда не иду.”*/
    short money = 700;
        if (money > 100) {
            System.out.println("Я иду в магазин.");
        } else {
            System.out.println("Я никуда не иду.");
        }
    }
}

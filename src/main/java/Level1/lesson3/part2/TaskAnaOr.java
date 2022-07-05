package Level1.lesson3.part2;

public class TaskAnaOr {
    public static void main(String[] args) {
//        Написать программу, в которой 2 boolean переменных isHungry, hasFood,
//        использовать “if” и “&&”, если обе переменные true, то вывести “Завтракаем”.
//        В любом случае в конце программы должен быть вывод “Иду на работу”.
        boolean isHungry = true;
        boolean hasFood = true;
        if (isHungry && hasFood){
            System.out.println("Let's have breakfast");
        }
        System.out.println("Go to work");
    }
}

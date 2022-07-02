package Level1.lesson3.part2;

public class StringСomparison {
    public static void main(String[] args) {
//        Создать программу, где если строка "2*2" выводим 4,
//        если строка "5*5" вывести 25, иначе вывести "я тебя не понимаю."
        String task = "2*2";
        if (task.equals("2*2")){
            System.out.println(4);
        }else if (task.equals(5*5)){
            System.out.println(25);
        } else {
            System.out.println("я тебя не понимаю.");
        }
    }
}

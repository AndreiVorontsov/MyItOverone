package Level1.lesson3.part2;

public class IfElse3 {
    public static void main(String[] args) {
//        if (boolean){
//            code1
//        } else if (boolean){
//            code2
//        }else {
//            code3
//        }
//        создать новый класс
//        создать переменную day, записать в неё любое значение от 0 до 10.
//        использовать многократную конструкцию if else if и вывести надписью день недели,
//        например если day = 1 - "пн", для 2 - "вт" и так далее, если 6 или 7, то вывести “выходной”.
//        Если число не попало под диапазон от 1 до 7 вывести надпись “Какое-то другое число”.

        byte day = 7;
        if ((day == 1) || (day == 8))
        {
            System.out.println("Пн");
        } else if ((day == 2) || (day == 9)){
            System.out.println("Вт");
        }else if ((day == 3) || (day == 10)){
            System.out.println("Ср");
        }else if (day == 4){
            System.out.println("Чт");
        }else if (day == 5){
            System.out.println("Пт");
        }else if (day == 6){
            System.out.println("Сб");
        }else if (day == 7){
            System.out.println("Вс");
        }
    }
}

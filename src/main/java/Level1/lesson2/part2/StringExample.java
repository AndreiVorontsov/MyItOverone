package Level1.lesson2.part2;

public class StringExample {
    public static void main(String[] args) {
        /* - создайте новый класс
   - создайте переменную с именем idea типа String и присвойте ей значение "I like Java!";
   - выведите на консоль эту переменную через команду System.out.println(idea);
   - присоедините к переменной idea строку "I begin to learn Java.";
   - создайте переменную year с типом int и присвойте ей текущий год.
   - присоедините к переменной idea переменную year;
   - выведите на консоль эту переменную через команду System.out.println(idea);*/
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + "I begin to learn Java.";
        int year = 2022;
        idea +=year;
        System.out.println(idea);
    }
}

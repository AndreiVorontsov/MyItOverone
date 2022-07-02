package level2.Lesson5_String.part1;

import java.util.Locale;

//Написать метод, который принимает строку и индекс.
// Метод печатает на экран текст вида:
// “Символ на позиции 0 это П”, либо “Символ на позиции 3 это В”.
// Пример выше для слова “Привет” и переданными индексами 0 и 3 соответственно.
public class Task01 {
    public static void main(String[] args) {
        String worlds = "Привет";
        print(worlds, 0);
        print(worlds, 3);
        print(worlds, 7);
    }

    static void print(String worlds, int index) {
        if (index < worlds.length()) {
            System.out.println("Символ на позиции " + index + " это " + worlds.toUpperCase().charAt(index));
        } else {
            System.out.println("NoIndex");
        }
    }
}

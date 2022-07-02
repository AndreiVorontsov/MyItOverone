package Level1.lesson2.part1;
/*1. В методе main создайте дополнительные переменные, кроме тех, что уже созданы.
        - переменную типа int c именем six и значением 6.
        - переменную типа int c именем four и значением 4.
        - переменную типа int с именем five и значением 5.

        2. Создайте еще три переменные для хранения результата арифметических операций.
        - переменную типа int c именем sixDivTwo и присвойте ей значение арифметической операции деления переменной six на two.
        - переменную типа int c именем fiveMinusTwo и присвойте ей значение арифметической операции вычитания переменной five c two.
  - переменную типа int c именем fourTimeTwo и присвойте ей значение арифметической операции умножения переменной four на two.

3. Выведите на консоль переменные sixDivTwo, fiveMinusTwo, fourTimeTwo.
        */


public class ArithmeticOperations {
    public static void main(String[] args) {
        int two = 2;
        //int secondNumber = 15;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(sixDivTwo + ";" + fiveMinusTwo + ";" + fourTimeTwo);
        //System.out.println(fiveMinusTwo);
        //System.out.println(fourTimeTwo);
        int size1 = 10;

        size1 = 100;
        size1 -= 5;
        System.out.println(size1);
    }
}

package Level1.lesson2.part2;

public class BooleanExample {
    public static void main(String[] args) {
//        boolean имя_переменной = переменная_1 оператор_сравнения переменная_2
//        <,>,==,!=
//        true,false
        // boolean isBigger = 2!=3;
        // System.out.println(isBigger);
        // && - and
        // || - or

        int first = 10;
        int second = 9;

        boolean result = first >= second;
        System.out.println(result);

        result = first <= second;
        System.out.println(result);

        result = first == second;
        System.out.println(result);
    }
}

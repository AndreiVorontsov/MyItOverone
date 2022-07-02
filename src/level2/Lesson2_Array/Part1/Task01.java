package level2.Lesson2_Array.Part1;
//- Массив на 10 элементов типа short с именем ages.
//        - Массив на 100500 элементов типа String c именем surnames.
//        - Массив на 40 элементов типа float с именем prices.

public class Task01 {
    public static void main(String[] args) {
        short[] ages = new short[10];// по умолчанию -0-
        String[] surnames = new String[100_500];// null
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }
}

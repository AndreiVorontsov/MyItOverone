package level2.Lesson3.Part1;

import java.util.Arrays;

//Создать массив размером 15 с типом элементов String.
// Записать в массив слова “чётный”, “нечётный” в зависимости от индекса,
// если индекс чётный, то должно быть слова “чётный”. Вывести полученный результат на экран.
public class Task02EvenNoEven {
    public static void main(String[] args) {
        String[] evenNoEven = new String[15];
        //even[0] = "0";
        for (int i = 0; i < evenNoEven.length; i++){
            evenNoEven[i] = i % 2 == 0 ? "индекс = " + i + " четный" : "индекс = " + i + " нечетный";
//        if (i % 2 == 0) {
//            evenNoEven[i] = "индекс = " + i + " четный";
//        } else {
//            evenNoEven[i] = "индекс = " + i + " нечетный";
//        }
    }
        for (String out : evenNoEven){
            System.out.println(out);
        }
        System.out.println(Arrays.toString(evenNoEven));
    }
}

package level2.Lesson2_Array.Part2;

import java.lang.reflect.Array;
import java.util.Arrays;

//Создайте внутри метода main массив String на 4 ячейки.
//            Дайте имя переменной созданного массива - names.
//            Заполните массив произвольными именами.
//            После этого выведите каждую ячейку на консоль.
public class Task02 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Adrei";
        names[1] = "Aleksei";
        names[2] = "Anna";
        names[3] = "Arsenii";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(Arrays.toString(names));
    }
}

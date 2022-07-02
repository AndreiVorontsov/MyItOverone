package level3.Lesson6_Map.part1;

import java.util.HashMap;
import java.util.Map;


//Создать map с именем dictionary(словарь), одно слово на русском, 2ое это описание/определение.
public class Dictionary1 {
    public static void main(String[] args) {
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("машина","транспорт");
        dictionary.put("дом","жилье");
        dictionary.put("мясо","еда");
        System.out.println(dictionary);
        for (Map.Entry<String,String> pair: dictionary.entrySet()){
            System.out.println(pair);
        }

    }
}

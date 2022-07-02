package level3.Lesson5_Collections.part1;

import java.util.LinkedList;
import java.util.List;

// В методе main создайте объект ArrayList с именем “список дел” с типом String.
// Добавьте в него ваши дела на день, например строки:
// “сделать зарядку”, “поесть”, “поехать в офис”, “поработать”, “поесть”, “поработать”, “приехать домой”,
// “обнять мужа/жену/детей”, “поесть”, “умыться”, “лечь спать”. В списке дел должно быть как минимум 2 раза “поесть”.
// Далее выведите все элементы на консоль, вначале через цикл for-each,
// затем просто передайте список в System.out.println().
public class Task01 {
    public static void main(String[] args) {
        List<String> toDoList = new LinkedList<>();
        toDoList.add("сделать зарядку");
        toDoList.add("поесть");
        toDoList.add("поработать");
        toDoList.add("поесть");
        toDoList.add("поработать");
        toDoList.add("обнять мужа/жену/детей");
        toDoList.add("поесть");
        toDoList.add("умыться");
        toDoList.add("лечь спать");
        for (String ToDo: toDoList){
            System.out.println(ToDo);
        }
        System.out.println(toDoList);
    }
}

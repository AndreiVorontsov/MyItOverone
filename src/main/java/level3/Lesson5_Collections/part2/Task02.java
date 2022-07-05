package level3.Lesson5_Collections.part2;

import java.util.*;

//В методе main создайте объект HashSet с именем “список дел” с типом String.
// Добавьте в него ваши дела на день, например: “сделать зарядку”, “поесть”,
// “поехать в офис”, “поработать”, “поесть”, “поработать”, “приехать домой”,
// “обнять мужа/жену/детей”, “поесть”, “умыться”, “лечь спать”.
// В списке дел должно быть как минимум 2 раза “поесть”.
// Далее выведите все элементы на консоль, вначале через цикл for-each,
// затем просто передайте множество в System.out.println().
public class Task02 {
    public static void main(String[] args) {
        Set<String> toDoList = new HashSet<>();
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

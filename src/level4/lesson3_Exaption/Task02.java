package level4.lesson3_Exaption;

//Создайте класс Человек с полем age, сделайте поле закрытым,
// создайте геттер и сеттер к полю, в сеттер добавьте проверку,
// если переданный аргумент меньше нуля выкиньте исключение
// RuntimeException  с сообщением “Возраст должен быть больше нуля”.
// Создайте метод main, в нём объект класса Человек и вызовите сеттер дважды,
// 1й раз с корректным значением, 2й раз с некорректным.
public class Task02 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(4);
        human.setAge(-4);
    }
}

class Human {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Возраст должен быть больше нуля");
        }
        this.age = age;
    }
}

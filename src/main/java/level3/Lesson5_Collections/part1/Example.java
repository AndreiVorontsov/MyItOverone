package level3.Lesson5_Collections.part1;


import java.util.ArrayList;
import java.util.List;

// пример работы с коллекциями
public class Example {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("ivan", 20));
        people.add(new Person("andrei", 27));
        System.out.println(people);
    }

}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

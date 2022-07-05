package level3.Lesson1;

//создайте класс Dog,
// в методе main создайте 3 объекта класса Dog и дайте собачьи имена
// своим переменным.
//По картинке создать класс с полями и методами.
// В main создать объекты этого класса также по картинке и присвоить
// полям значения с картинки. В методах выводить что делает метод,
// например для метода “eat” выводить “я ем”,
// либо по английски “I eat”
// https://www.guru99.com/images/java/052016_0704_ObjectsandC6.jpg
public class Dog {
    String breed;
    String size;
    int age;
    String color;

    Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    void printInfo() {
        System.out.println("breed - " + breed);
        System.out.println("size - " + size);
        System.out.println("age - " + age);
        System.out.println("color - " + color);
    }

    void eat() {
        System.out.println(" я ем");
    }

    void sleep() {
        System.out.println(" я сплю");
    }

    void sit() {
        System.out.println(" я сижу");
    }

    void run() {
        System.out.println(" я бегу");
    }


    public static void main(String[] args) {
        Dog djec = new Dog("mastiv", "large", 5, "black");
        djec.printInfo();
        Dog hip = new Dog("Maltese", "smal", 2, "white");
        hip.printInfo();
        Dog deil = new Dog("Chow", "midium", 3, "brown");
        deil.printInfo();

    }
}

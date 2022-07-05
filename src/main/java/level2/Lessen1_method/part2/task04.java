package level2.Lessen1_method.part2;

public class task04 {
    public static void main(String[] args) {
        String name = "Victoria";
        int age = 33;
        hello(name, age);
        hello(name, age);
        hello(name, age);
        hello(name, age);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);

    }
}

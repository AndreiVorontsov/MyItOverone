package level4.lesson4.part01;

public class MyClass {
    @OnlyForField
    int a;

    @OnlyForField
    String s;

    @OnlyForMethod
    void myMethod1() {
        System.out.println(a);
    }

    void myMethod2() {
        System.out.println(s);
    }
}

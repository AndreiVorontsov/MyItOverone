package level2.Lessen1_method.HomeWork;
//Создать класс Калькулятор, в нём 4 метода для арифметических операций:
//сложение, вычитание, умножение и деление. Каждый метод должен принимать
//2 параметра типа double и возвращать значение типа double.
public class Calculator {
    public static void main(String[] args) {
    double x = 6;
    double y = 3;
        System.out.println("addition result = " + addition(x,y));
        System.out.println("subtraction result = " + subtraction(x,y));
        System.out.println("division result = " + division(x,y));
        System.out.println("multiplication result = " + multiplication(x,y));
    }
    static double addition(double x, double y){
        return  (x + y);
    }
    static double subtraction(double x, double y){
        return  (x - y);
    }
    static double division(double x, double y){return  (x / y);}
    static double multiplication(double x, double y){
        return  (x * y);
    }
}

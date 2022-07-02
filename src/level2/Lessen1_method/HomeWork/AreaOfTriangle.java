package level2.Lessen1_method.HomeWork;

import static java.lang.Math.sqrt;

//Площадь треугольника по формуле Герона. В этой з-че нужно будет использовать метод класса Math.
// В качестве аргументов стороны a, b, c.
// По формуле Герона(погуглить) вначале вычислить полупериметр, затем площадь.
// Площадь треугольника по формуле Герона вычисляется как квадратный корень
// из произведения полупериметра треугольника и разностей полупериметра и каждой из сторон треугольника.

public class AreaOfTriangle {
    public static void main(String[] args) {
    double a = 10;
    double b = 12;
    double c = 15;
    double p = (a + b + c) / 2;
        System.out.println(sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}

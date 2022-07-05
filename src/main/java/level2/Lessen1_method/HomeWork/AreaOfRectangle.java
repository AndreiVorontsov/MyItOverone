package level2.Lessen1_method.HomeWork;
//Площадь прямоугольника. Создать класс с методом расчёта площади прямоугольника,
// в качестве аргументов приходит высота и ширина, возвращать площадь.
public class AreaOfRectangle {
    public static void main(String[] args) {
    double height = 4;
    double width  = 6;
        System.out.println("Area of the rectangle " + height + "*" + width + " = " + areaOfRectangle(height,width));
    }
    static double areaOfRectangle(double height, double width){
     return (height * width);
    }
}

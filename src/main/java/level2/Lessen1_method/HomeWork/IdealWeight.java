package level2.Lessen1_method.HomeWork;
// JavaDoc

//Идеальный вес. Создать класс с методом расчета идеального веса по формуле:
//вес равен росту минус коэффициент. При росте до 165 см коэффициент
//равен 100, до 175 см — 105, выше 175 см — 110.
public class IdealWeight {
    public static void main(String[] args) {
        double growth = 180.5;
        System.out.println("you ideal weight = " + idealWeight(growth));
    }

    static double idealWeight(double growth) {
        if (growth < 165) {
            return (growth - 100);
        } else if (growth < 175) {
            return (growth - 105);
        } else {
            return (growth - 110);
        }
    }


}

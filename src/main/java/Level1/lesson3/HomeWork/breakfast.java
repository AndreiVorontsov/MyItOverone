package Level1.lesson3.HomeWork;
// Завтрак
//        - создать программу, в ней 2 логических переменных “есть сковородка“, “есть яйца”.
//        Если есть яйца и сковородка, то вывести “Готовим яичницу”.
//        В конце программы должен быть вывод “Идём на работу.”.
public class breakfast {
    public static void main(String[] args) {
        boolean hasFryingPan = false;
        boolean hasEggs = true;
        if (hasFryingPan && hasEggs){
            System.out.println("Готовим яичницу");
        }
        System.out.println("Идём на работу.");
    }
}

package Level1.Exam1;
//Дано расстояние L в сантиметрах.
//        Использую операцию деления нацело, найти количество полных метров в нём (1м = 100см)
public class Tasak01 {
    public static void main(String[] args) {
        int l = 356;
        int x = l%100;
        int result = (l-x)/100;
        System.out.println(result + " m");
    }

}

package level2.Lessen1_method.part2;
//Написать метод min, который возвращает минимальное из 2 аргументов.
// В этой з-че использовать вначале if else конструкцию,
// затем её закомментировать и использовать конструкцию “тернарного оператора”.
public class Task06 {
    public static void main(String[] args) {
       // FindMin(7,6);
        System.out.println(FindMin(7,6));
    }
    static int FindMin(int x, int y){
//        int min;
//        if (x>y){
//
//            return min = x;
//        }else {
//            return min = y;
//        }
        return (x>y)?x:y;
    }
}

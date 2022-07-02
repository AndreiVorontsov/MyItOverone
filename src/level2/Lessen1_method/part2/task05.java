package level2.Lessen1_method.part2;
//Изменить прошлую з-чу, теперь метод “сложение” должен возвращать результат,
// а не выводить его в консоль.
// В методе main, записать результаты выводов в отдельные переменные и эти переменные вывести в консоль.
public class task05 {
    public static void main(String[] args) {
        int q1 = add(100,500);
        System.out.println(q1);
        int q2 = add(4,2);
        System.out.println(q2);
        int q3 = add(3,5);
        System.out.println(q3);

    }
    static int add(int x, int y){
        return (x +y);
    }
}

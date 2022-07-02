package level2.Lessen1_method.part1;
//Создать класс, в нём свой метод “сложение” с двумя int аргументами,
// метод должен выводить в консоль сумму двух аргументов.
// В методе main вызвать свой метод с аргументами: 100 и 500, 4 и 2, 3 и 5.
public class Task03 {
    public static void main(String[] args) {
        add(100,500);
        add(4,2);
        add(3,5);
    }
    static void add(int x, int y){
        System.out.println(x +y);
    }
}

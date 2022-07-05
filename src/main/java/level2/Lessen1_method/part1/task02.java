package level2.Lessen1_method.part1;

//Создать класс, в нём создать три своих метода: “идти налево”, “идти направо”, “идти прямо”,
// каждый должен выводить на экран соответствующую информацию.
// Что выводить на экран берём из сказки Змей Горыныча:
// Налево пойдёшь - богатым будешь, направо - женатым, а кто прямо пойдёт, тот к камню вернётся.
//В main, вызвать методы “идтиПрямо” 2 раза и 1 раз вызвать любой другой свой метод.
public class task02 {
    public static void main(String[] args) {
        goLeft();
//goStraight();
//        goRight();
        goStraight();
        goStraight();
    }

    static void goLeft() {
        System.out.println("Налево пойдёшь - богатым будешь");
    }

    static void goRight() {
        System.out.println("направо - женатым");
    }

    static void goStraight() {
        System.out.println("а кто прямо пойдёт, тот к камню вернётся.");
    }
}

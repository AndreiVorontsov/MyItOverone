package level2.Lessen1_method.part1;
//Создать класс с 2 методами: “проснуться” и “идтиСпать”. В методе “проснуться” вывести на экран несколько строк:
// “Открыть глаза”, “Умыться”, “Одеться”, “Сделать зарядку”.
// В методе “идтиСпать” - “Умыться”, “Раздеться”, “Лечь”, “Видеть сны”.
//
//       Создать метод main, в нём вызвать оба своих метода.
public class Task01 {
    public static void main(String[] args) {
        System.out.println("Проснутся");
        wakeUp();
        System.out.println("Спать");
    goToSleep();
    }
    static void wakeUp(){
        System.out.println("Открыть глаза");
        System.out.println("Умыться");
        System.out.println("Одеться");
        System.out.println("Сделать зарядку");
    }
    static void goToSleep(){
        System.out.println("Умыться");
        System.out.println("Раздеться");
        System.out.println("Лечь");
        System.out.println("Видеть сны");
    }
}

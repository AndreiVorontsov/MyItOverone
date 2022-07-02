package level4.lesson3_Exaption;
//Создать переменную строкового типа, записать в качестве значения null
// ( обязательно без кавычек).
// На следующей строке попробовать вывести в консоль длину этой строки с помощью метода строки length().
// Убедится, что произошло исключение, написать в чат + и имя/тип исключения.
public class task01 {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.length());
    }
}

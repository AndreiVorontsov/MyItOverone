package level4.lesson3_Exaption;
//Сделать вывод на экран “Начало main”.
// Создать массив на 3 элемента.
// В блоке try вывести на экран “Начало try”, далее присвоить 1 эл-ту массива любое значение, вывести “Конец try”.
// Добавить catch, в нём можете ловить как исключение типа “Exception”, так и “ArrayIndexOutOfBoundsException”,
// в блоке catch вывести “Произошла ошибка”. Добавить блок finally, в нём вывести “Этот код выполнится всегда”.
// После блока finally вывести “Конец main”. Запустить, посмотреть вывод консоли, понять почему вывод в консоли,
//  именно такой. Изменить присвоение 1го эл-та в блоке try на 10 эл-т,
// таким образом возникнет исключение. Ещё раз посмотреть вывод, понять почему сейчас вывод другой и именно такой.
// Написать + в чат.

import java.lang.reflect.Array;

public class Task03 {
    public static void main(String[] args) {
        System.out.println(" Начало main");
        int arr[]= {2,3,4,};
        try {
            System.out.println("начало try");
            arr[0] = 1;
            System.out.println("конец try");
        }catch (Exception ex){
            System.out.println("Произошла ошибка");
        }finally {
            System.out.println("Этот код выполнится всегда");
        }
        System.out.println("Конец main");
    }
}

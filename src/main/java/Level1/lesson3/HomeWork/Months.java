package Level1.lesson3.HomeWork;
//Месяцы
//        - создать программу, с переменной “месяц” и значением от 1 до 12. Использовать
//        конструкцию “if else if”. Сделать проверку числа и вывести соответствующий
//        месяц, для 1 - январь, для 2 - февраль и так далее.
public class Months {
    public static void main(String[] args) {
        int month = 4;
        if (month == 1){
            System.out.println("Январь");
        } else if (month == 2){
            System.out.println("Февраль");
        }else if (month == 3){
            System.out.println("Март");
        }else if (month == 4){
            System.out.println("Апрель");
        }else if (month == 5){
            System.out.println("Май");
        }else if (month == 6){
            System.out.println("Июнь");
        }else if (month == 7){
            System.out.println("Июль");
        }else if (month == 8){
            System.out.println("Август");
        }else if (month == 9){
            System.out.println("Сентябрь");
        }else if (month == 10){
            System.out.println("Октябрь");
        }else if (month == 11){
            System.out.println("Ноябрь");
        }else if (month == 12){
            System.out.println("Декабрь");
        }

    }
}

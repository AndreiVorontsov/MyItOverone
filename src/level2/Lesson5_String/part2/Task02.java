package level2.Lesson5_String.part2;
//Написать метод, принимающий в качестве параметров имя, фамилию и отчество и
// возвращающую инициалы в формате "Ф.И.О". Учесть,
// что входные параметры могут быть в любом регистре,
// а результирующая строка должна быть в верхнем.
public class Task02 {
    public static void main(String[] args) {
        String surName = "Vorontsov";
        String name = "Andrei";
        String suName = "Sergeevich";
        System.out.println(FIO(surName,name,suName));
    }
    static String FIO( String surName, String name, String suName){
        String result;
        String F = String.valueOf(surName.charAt(0));
        String I = String.valueOf(name.charAt(0));
        String O = String.valueOf(suName.charAt(0));
        result = F + "." + I + "." + O;
        return result.toUpperCase();

    }
}

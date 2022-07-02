package level2.Lesson5_String.part1;

public class Example2 {
    public static void main(String[] args) {
        // indexOf -- вернет первый индекс 'a', lastIndexOf('a') - первый с конца
        String name = "Ivan Ivanov";
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        // substring - вернет подстроку в пределох заданных индексах, можно ввести только начальный индекс - тогда с его и до конца.
        String phrase = "Hello, my name is Alex";
        System.out.println(phrase.substring(7, 14));
        // isEmpty - проверит пустая ли строка, вернет boolean
        String string = "";
        String string2 = "     ";
        System.out.println(string.isEmpty());
        System.out.println(string2.trim().isEmpty());
        // trim - уберает пробелы в начале и конце строки
        String string4 = "   a и  ";
        System.out.println(string4);
        System.out.println(string4.length());
        System.out.println(string4.trim());
        System.out.println(string4.trim().length());
        // replace - заменит заданные символа
        String string5 = "Hillo, my name is Alex. Hillo, Hillo";
        System.out.println(string5.replace("Hillo", "Hello"));
        // startWith / endWith - проверяет начинается/закнчивается строка с данных символов -вернет boolean
        String string6 = "Котёнок";
        System.out.println(string6.startsWith("Кот"));
        System.out.println(string6.startsWith("Кат"));
        // contains - проверит содержится ли данные символы в строке -вернет boolean
        System.out.println(string6.contains("Кот"));
        System.out.println(string6.contains("тён"));
        System.out.println(string6.contains("Кат"));
        // repeat - повторит заданное число раз
        String string7 = "abc";
        System.out.println(string7.repeat(5));
    }
}

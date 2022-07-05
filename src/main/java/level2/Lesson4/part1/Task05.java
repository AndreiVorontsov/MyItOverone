package level2.Lesson4.part1;

import java.util.Arrays;

//Создать метод, который принимает 2 массива символов.
// Этот метод проверяет, что слово начинается c определенной последовательности.
//Например:
//char[] word = {‘П’,’р’,’и’,’в’,’е’,’т’};
//char[] firstPrefix = {‘П’,’р’,’и’}
//char[] secondPrefix = {‘П’,’р’,’е’}
//	Для вызова метода (word, firstPrefix) должно вернуться true, для вызова метода(word, secondPrefix) - false.
public class Task05 {
    public static void main(String[] args) {
        char[] word = {'П', 'р', 'и', 'в', 'е', 'т'};
        char[] firstPrefix = {'П', 'р', 'и'};
        char[] secondPrefix = {'П', 'р', 'е'};
        System.out.println(isСompare(word, firstPrefix));
        System.out.println(isСompare(word, secondPrefix));

    }

    static boolean isСompare(char[] array1, char[] array2) {
        boolean result = true;
        for (int i = 0; i < array2.length; i++) {
            if (array1[i] != (array2[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}

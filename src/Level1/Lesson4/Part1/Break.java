package Level1.Lesson4.Part1;
//Создать цикл от 10 до 1_000, но с условиями, если число меньше 100,
// то продолжить цикл не выполняя оставшуюся часть тела цикла,
// если число больше 150, то выйти(прервать) из цикла, в конце тело цикла выводить текущий счётчик.

public class Break {
    public static void main(String[] args) {
        for (int i = 10; i < 1_000; i++) {
            if (i < 100){
                continue;
            }else if(i > 150){
                break;
            }
            System.out.println(i);
        }
    }
}

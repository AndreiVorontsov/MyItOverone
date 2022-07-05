package level3.Lesson1;

//Создайте класс Student, создайте метод “петь песню”.
// Этот метод должен выводить на консоль слова "I believe I can fly".
// Также у вас должен быть метод playMusic, который выводит на экран “tra-tra-tra”.
// В методе main попросите Петю три раза сыграть на баяне и три раза спеть.
public class Student {
    void singSong(String lyric) {
        System.out.println("I believe I can fly - " + lyric);
    }

    void playMusik() {
        System.out.println("tra-tra-tra");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.playMusik();
        petya.playMusik();
        petya.playMusik();
        petya.singSong("one song");
        petya.singSong("two song");
        petya.singSong("tree song");
    }
}

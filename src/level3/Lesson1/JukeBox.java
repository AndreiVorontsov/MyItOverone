package level3.Lesson1;

//Создайте класс Jukebox.
// Добавьте в него метод public void music(int position).
// Внутри метода сделайте if else.
// Если position равно 1, то в консоль должны выводиться слова песни "Пусть бегут неуклюже".
// Если равно 2, то в консоль должны выводиться слова песни "Спокойной ночи".
// Во всех остальных случаях должно появиться "Песня не найдена".
// Напишите метод main с демонстрацией работы этого метода и объекта этого класса.
public class JukeBox {
   public void playMusic(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        JukeBox musicForPeople = new JukeBox();
        musicForPeople.playMusic(1);
        musicForPeople.playMusic(2);
        musicForPeople.playMusic(5);
    }
}

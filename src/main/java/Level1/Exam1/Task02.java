package Level1.Exam1;

//Переменная num может принимать 4 значения: 1, 2, 3 или 4.
//        Если она имеет значение '1', то в переменную result запишем 'зима',
//        если имеет значение '2' – 'весна' и так далее. Решите задачу через switch-case.
public class Task02 {
    public static void main(String[] args) {
        int num = 1;
        String result = "";
        switch (num) {
            case 1:
                result = "зима";
                break;
            case 2:
                result = "весна";
                break;
            case 3:
                result = "лето";
                break;
            case 4:
                result = "осень";
                break;
        }
        System.out.println(result);
    }
}

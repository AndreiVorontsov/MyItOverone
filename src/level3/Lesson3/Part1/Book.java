package level3.Lesson3.Part1;

//Создайте класс Книга, с полями название, кол-во страниц.
// Поля сделайте закрытыми, добавьте геттеры и сеттеры к полям.
// В сеттеры добавьте проверки для кол-ва страниц нельзя установить значения меньше 0,
// для названия нельзя чтобы в название содержалось слово “name” (У строк есть метод “contains()”).
public class Book {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains("name")) {
            System.out.println("ошибка имени");
        }
        this.name = name;
    }

    public int getCounterPage() {
        return counterPage;
    }

    public void setCounterPage(int counterPage) {
        if (counterPage > 0) {
            this.counterPage = counterPage;
        } else {
            System.out.println("не верное количество страниц");
        }
    }

    private String name;
    private int counterPage;


}


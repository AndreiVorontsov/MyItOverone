package level3.Lesson3.Part2;
//Создать класс Человек, Танцор, Певец, Доктор.
// У класса Человек есть метод зарабатывать деньги, в нём выводить “работаю на обычной работе”.
// Классы Танцор, Певец и Доктор наследуют класс Человек и переопределяют метод зарабатывать деньги,
// каждый переопределяет метод по своему, написать свою реализацию,
// например для доктора вывод на экран “Лечу людей, помогаю быть здоровыми”.
// В методе main создать массив с типом Человек,
// туда записать несколько объектов разных типов Человека.
// Пройтись по массиву через цикл вызвать у каждого объекта метод зарабатывания денег.
public class Man {
    void earnMoney(){
        System.out.println("работаю на обычной работе");
    }
}
class Dancer extends Man{
    @Override
    void earnMoney() {
        System.out.println("Танцую, делаю сложные элементы");
    }
}

class Singer extends Man {
    @Override
     void earnMoney() {
        System.out.println("Пою песни, поднимаю настроение");
    }
}
class Doctor extends Man {
    @Override
    void earnMoney() {
        System.out.println("Лечу людей, помогаю быть здоровыми");
    }
}

class ManInfo{
    public static void main(String[] args) {
        Man[] man = new Man[5];
        man[0] = new Man();
        man[1] = new Dancer();
        man[2] = new Dancer();
        man[3] = new Singer();
        man[4] = new Doctor();
        for (Man mans: man){
            mans.earnMoney();
        }
    }
}
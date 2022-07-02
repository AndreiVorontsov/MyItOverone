package level3.Lesson4.Part2;

//Создать интерфейсы «летать»,
// «передвигаться» и «есть пищу».
// Создайте классы и добавьте интерфейсы к ним, классы: собака, утка, автомобиль и самолёт.
// Руководствуйтесь фантазией и здравым смыслом.
interface Fly {
    void fly();
}

interface Move {
    void move();
}

interface EatFood {
    void eatFood();
}

class Dog implements Move, EatFood {
    @Override
    public void move() {
        System.out.println("следует за хозяином");
    }

    @Override
    public void eatFood() {
        System.out.print("Собака - кушает косточки, ");
    }
}

class Duck implements Fly, Move, EatFood {
    @Override
    public void fly() {
        System.out.println("высоко не летает");
    }

    @Override
    public void move() {
        System.out.print("метленно перемещается по земле, ");
    }

    @Override
    public void eatFood() {
        System.out.print("Утка - кушает хлеб, ");
    }
}

class Car implements Move {
    @Override
    public void move() {
        System.out.println("Машина - хорошо перемещается по асфальтированной дороге");
    }
}

class Plane implements Fly {
    @Override
    public void fly() {
        System.out.println("Самолет - быстро летат");
    }
}

class OutputExample {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
        System.out.println();
        Dog dog = new Dog();
        dog.eatFood();
        dog.move();
        System.out.println();
        Duck duck = new Duck();
        duck.eatFood();
        duck.move();
        duck.fly();
        System.out.println();
        Car car = new Car();
        car.move();
    }
}




package level3.Lesson4.Part1;

//создайте абстрактный класс Product, от него наследуйте 3 любых любимых вида реальных продуктов, например:
// Яблоки, Томатный суп, Торт и т.д.
// По желанию попробуйте придумать что-нибудь своё, если не получится берите уже готовые из задачи варианты.
// В абстрактный класс добавьте общие для всех продуктов поля “цена”,
// “единица измерения”(может быть: “кг”, “литр”)
// и поле “тип”(может быть например: “десерт”, “1ое блюдо”, “2ое блюдо”, “гарнир”, “напиток” и т.д.).
// В абстр. классе должны быть 2 метода: “показать информацию” и “готовить”,
// 1й метод реализован в абстрактном классе и выводит значения всех полей в консоль,
// 2й метод абстрактный и реализуется в подклассах, например выводом в консоль для Яблока “помыть”,
// для Томатного супа - “разогреть в кастрюле”, для Торта - “порезать на равные кусочки чтобы досталось каждому”.
// Создайте метод main, в массив добавьте несколько продуктов и через цикл вызовите оба метода на каждом продукте.
abstract class Product {
    //    int calories;
    int cost;
    int unit;
    String type;

    Product(int cost, int unit, String type) {
        this.cost = cost;
        this.unit = unit;
        this.type = type;
    }


//    void productInfo() {
//        System.out.println("цена = " + cost + "руб");
//        System.out.println(unit + " кг");
//        System.out.println("Тип еды -" + type);
//}

    abstract void Cook();

}

class Apple extends Product {
    Apple(int cost, int unit, String type) {
        super(cost, unit, type);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "cost=" + cost +
                ", unit=" + unit +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    void Cook() {
        System.out.println("помыть");
    }
}

class TomatoSoup extends Product {
    TomatoSoup(int cost, int unit, String type) {
        super(cost, unit, type);
    }

    @Override
    public String toString() {
        return "TomatoSoup{" +
                "cost=" + cost +
                ", unit=" + unit +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    void Cook() {
        System.out.println("разогреть в кастрюле");
    }
}

class Cake extends Product {
    Cake(int cost, int unit, String type) {
        super(cost, unit, type);
    }

    @Override
    public String toString() {
        return "Cake{" +
                "cost=" + cost +
                ", unit=" + unit +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    void Cook() {
        System.out.println("порезать на равные кусочки чтобы досталось каждому");
    }
}

class Kitchen {
    public static void main(String[] args) {
        Product[] KitchenProduct = {
                new Apple(2, 1, "десерт"),
                new TomatoSoup(4, 2, "1ое блюдо"),
                new Cake(7, 2, "десерт")};
        for (Product product : KitchenProduct) {
//            product.productInfo();
            System.out.println(product);
            product.Cook();
            System.out.println();
        }
    }
}

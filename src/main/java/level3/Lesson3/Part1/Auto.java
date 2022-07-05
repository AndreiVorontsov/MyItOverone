package level3.Lesson3.Part1;
//Создать класс автомобиль,
// в нём открытый метод “запуск” и закрытые методы: “взять ток с аккумулятора”,
// “передать ток на стартер”, “соединить шерстень и маховик”, “запустить двигатель”.
// В открытом методе должны быть вызваны закрытые методы,
// в закрытых методах должен быть вывод на экран информации о том, что делает этот метод.
// Создать класс “использование автомобиля”, в методе main создать объект автомобиля,
// попытаться вызвать закрытые методы, после этого вызвать открытый метод.
public class Auto {
    public void startAuto(){
    takeCurrentFromBattery();
    transmitCurrentToStarter();
    connectWoolAndFlywheel();
    startEngine();

    }

    private void takeCurrentFromBattery(){
        System.out.println("взять ток с аккумулятора");
    }

    private void transmitCurrentToStarter(){
        System.out.println("передать ток на стартер");
    }
    private void connectWoolAndFlywheel(){
        System.out.println("соединить шерстень и маховик");
    }
    private void startEngine(){
        System.out.println("запустить двигатель");
    }
}

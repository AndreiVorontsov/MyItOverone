package Child.Chapter12.Enum;

//Автоматизированное управление светофором
public class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc; // текущий цвет светофора
    boolean stop = false; // для остановки имитации установить true
    boolean changed = false; // true, если светофор переключился

    public TrafficLightSimulator(TrafficLightColor init) {
        this.tlc = init;
    }

    public TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
    }

    //Запуск имитации автоматизированного светофора
    @Override
    public void run() {
        while (!stop) {
            try {
                switch (tlc) {
                    case GREEN:
                        Thread.sleep(10_000); // зеленый на 10 секунд
                        break;
                    case YELLOW:
                        Thread.sleep(2_000); // желтый на 2 секунды
                        break;
                    case RED:
                        Thread.sleep(12_000); // красный на 12 секунд
                        break;
                }
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
            changedColor();
        }
    }

    //    Переключаем цвета светофора
    synchronized void changedColor() {
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify(); // уведомить о переключении цвета светофора
    }
    synchronized void waitForChange(){
        try{
            while (!changed)
                wait();//ожидает переключения цвета светофора
            changed = false;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }
    //        Возврат текущего цвета
    synchronized TrafficLightColor getColor() {
        return tlc;
    }
    //             Прекращение имитации светофора
    synchronized void cancel() {
        stop = true;
    }
}

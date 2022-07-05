package level2.Lessen1_method.HomeWork;
//Курс валют. Создать класс с 2 методами: перевода рублей в доллары и
//долларов в рубли.
public class CurrencyExchange {
    public static void main(String[] args) {
        double byn = 4900;
        double usd = 40;
        System.out.println("for " + byn + "byn you get " + BynInUsd(byn) +"$" );
        System.out.println("for " + usd + "$ you get " + UsdInByn(usd) +"byn" );
    }
    static double BynInUsd(double  byn){
        double rate = 2.85;
        return (byn / rate);
    }
    static double UsdInByn(double usd){
        double rate = 2.7;
        return (usd*rate);
    }
}

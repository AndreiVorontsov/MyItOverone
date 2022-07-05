package Level1.Lesson4.HomeWork;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10; j++) {
                /*System.out.print(j + "*" + i);
                System.out.print( "=" + (i * j) + "\t");*/
                if ((i * j) < 10) {
                    System.out.print(j + "*" + i + " = " + (i * j) + "  \t");
                }else if (i == 10 || j == 10){
                    System.out.print(j + "*" + i + " = " + (i * j) + "\t");
                }else {
                    System.out.print(j + "*" + i + " = " + (i * j) + " \t");
                }
            }
            System.out.println();
        }
    }
}

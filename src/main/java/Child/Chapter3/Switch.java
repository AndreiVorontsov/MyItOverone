package Child.Chapter3;

public class Switch {
    public static void main(String[] args) {
        char ch1 = 'B';
        char ch2 = 'B';
        switch (ch1){
            case 'A':
            {
                System.out.println("Это ветвь внешней инструкции switch");
                switch (ch2) {
                    case 'A': {
                        System.out.println("это ветвь внутренней инструкции switch");
                        break;
                    }
                    case 'B': {
                        System.out.println("это ветвь внутренней инструкции switch B");
                        break;
                    }
                }
               break;
            }
            case 'B':{
                System.out.println("Это ветвь внешней инструкции switch B");
                break;
            }
        }
    }
}

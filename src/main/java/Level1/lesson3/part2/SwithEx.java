package Level1.lesson3.part2;

public class SwithEx {
    public static void main(String[] args) {
//        з-чу на проверку строк,
//        создать переменную day записать любое значение из: пн, вт, ср, чт, пт, выходной.
//                используя if else if вывести день недели,
//                для пн - 1, для вт - 2, для выходной надпись “6й, либо 7й день недели”.
        String day = "выходной";
        switch (day) {
            case "пн":
                System.out.println(1);
                break;
            case "вт":
                System.out.println(2);
                break;
            case "ср":
                System.out.println(3);
                break;
            case "чт":
                System.out.println(4);
                break;
            case "пт":
                System.out.println(5);
                break;
            case "выходной":
                System.out.println("6й, либо 7й день недели");
                break;
            default:
                System.out.println("что то другое");
        }

    }
}

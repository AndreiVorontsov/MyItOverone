package level2.Lesson5_String.part2;
//Написать 3 метода,
// которые подсчитывают количество всех точек,
// запятых и восклицательных знаков в строке.
public class Task04 {
    public static void main(String[] args) {
        String string = ". , ! .,,!!..";
        System.out.println("Количество точек = " + countDot(string));
        System.out.println("Количество запятых = " + countComma(string));
        System.out.println("Количество восклицательных знаков = " + countExclamationPoint(string));
    }
    static int countDot(String string){
        char[] array = string.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == '.'){
                count++;
            }

        }
        return count;
    }
    static int countComma(String string){
        //String[] strings = string.split("");
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ','){
                count++;
            }

        }
        return count;
    }
    static int countExclamationPoint(String string){
        String[] strings = string.split("");
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals("!")){
                count++;
            }

        }
        return count;
    }
}

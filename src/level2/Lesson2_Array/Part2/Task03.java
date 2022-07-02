package level2.Lesson2_Array.Part2;
//
public class Task03 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 10; i > 0; i--) {
            numbers[i-1] = 11 - i;
        }
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}

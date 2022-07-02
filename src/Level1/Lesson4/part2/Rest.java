package Level1.Lesson4.part2;
//показать все числа от 1 до 100,
// которые делятся без остатка на 3 и на 5.
// В выводе должны быть числа: 15, 30, 45, 60, 75, 90.
public class Rest {
    public static void main(String[] args) {
        for (int i = 1; i < 100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i < 100 ; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }

        }



    }

}

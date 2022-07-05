package Level1.lesson3.part1;

public class IfElse2 {
    public static void main(String[] args) {
//        создать класс
//        создать переменную temperature, присвоить любое значение от -30 до 30.
//        создать переменную isCold, в ней должна быть проверка temperature, меньше ли она 15.
//        использовать “if”, если isCold равняется true, то вывести “Одеваю пальто”
//        в конце программы должен быть вывод “Иду гулять.”
//        подумать, нужно ли делать проверку isCold на true или можно упростить?

        float temperature = -20.2F;
        boolean isCold = temperature < 15;
        if (isCold){
            System.out.println("Одеваю пальто");
        }
        System.out.println("Иду гулять.");
    }
}

package level2.Exam;
// 5*. Написать метод, который принимает 2 строковых аргумента.
//Метод должен вернуть сколько раз встречается 1 аргумент во 2 аргументе.
public class Task05 {
    public static void main(String[] args) {
        String one = "qwe";
        String second = "rasqwedfrsdfqweaqweaqwe";
        System.out.println(countArgs(one,second));
    }
    static int countArgs(String one, String second){
        int count = 0;
        int index = 0;
//        сделать через indexOf()
        while((index = second.indexOf(one,index)) >= 0){
            index +=one.length();
            count++;
        }
//        if (second.contains(one)) {
//            String[] strings = second.split(one);
//            count = strings.length-1;
//        }
//        if (second.endsWith(one)){
//            String[] strings = second.split(one);
//            count = strings.length;
//        }
        return count;
    }
}

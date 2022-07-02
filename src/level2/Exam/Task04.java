package level2.Exam;
//Создать метод, который принимает boolean массив и проверяет, что массив однородной, т.е. в нём все эл-ты это только true,
//либо только false. Метод возвращает true, если массив однородный, в противоположном случае false.
public class Task04 {
    public static void main(String[] args) {
        boolean[] array = {false,false,false,false,false,false};
        boolean[] array1 = {true,true,true,true,true,true};
        boolean[] array2= {false,false,false,false,true};
        System.out.println(checkArray(array));
        System.out.println(checkArray(array1));
        System.out.println(checkArray(array2));
    }
    static boolean checkArray(boolean array[]){
        boolean isCheck = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i+1]){
                isCheck = true;
            }else {
                isCheck = false;
                break;
            }
        }
        return isCheck;
    }
}

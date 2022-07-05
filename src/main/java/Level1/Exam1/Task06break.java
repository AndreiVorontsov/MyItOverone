package Level1.Exam1;

public class Task06break {
    public static void main(String[] args) {
        int n = 345;
        int initial = n;
        String result ="";
        for (int i = 0; i > -1 ; i++) {
            int t;
            if (n/10 != 0){
                t = n%((n/10)*10);
                result += t;
                n = (n - t)/10;
            }else {
                result += n;
                break;
            }
        }System.out.println("исходное число " + initial + "\nс права на лево " + result);
    }
}

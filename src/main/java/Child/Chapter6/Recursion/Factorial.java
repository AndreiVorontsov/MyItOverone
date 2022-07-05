package Child.Chapter6.Recursion;

// Вычисление факториала рекурсивным методам
public class Factorial {
    int factR(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = factR(n - 1) * n;
        return result;
    }
}

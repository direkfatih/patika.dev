import java.util.Scanner;

public class Main {

    static int fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        // f(n) = f(n-1) + f(n-2)

        System.out.println(fib(5));

    }
}
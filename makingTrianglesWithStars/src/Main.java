import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();

        //For İle Yıldızlarla Üçgen Yapımı
        System.out.println("For İle Üçgen");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("---------------------------");
        System.out.println("For ile Elmas");
        //For İle Yıldızlarla Elmas Yapımı
        for (int i = 1; i <= (2*n); i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int t = (i - n) ; t > 0 ; t--){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1 && i <= n; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= (2 * (2 * n - i) - 1) && i > n; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("---------------------------");
        //While İle Yıldızlarla Üçgen Yapımı
        System.out.println("While ile Üçgen");
        int c = 0;
        while (c <= n){
            int v = 0;
            while (v < (n - c)){
                System.out.print(" ");
                v++;
            }
            int b = 1;
            while (b <= ((2 * c) - 1)){
                System.out.print("*");
                b++;
            }
            System.out.println(" ");
            c++;
        }
        System.out.println("---------------------------");
        System.out.println("While ile Elmas");
        int a = 1;
        while (a <= (2*n)){
            int s = 1;
            while (s <= n - a){
                System.out.print(" ");
                s++;
            }
            int d = a - n;
            while (d > 0 ){
                System.out.print(" ");
                d--;
            }
            int f = 1;
            while (f <= (2 * a) - 1 && a <= n){
                System.out.print("*");
                f++;
            }
            int g = 1;
            while (g <= (2 * (2 * n - a) - 1) && a > n){
                System.out.print("*");
                g++;
            }
            System.out.println(" ");
            a++;
        }
        System.out.println("---------------------------");


    }
}
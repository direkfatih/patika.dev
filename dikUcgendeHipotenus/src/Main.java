import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b;
        double c;

        System.out.print("1. Kenarı giriniz : ");
        a = input.nextInt();
        System.out.print("2. Kenarı giriniz : ");
        b = input.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);

        double u = (a+b+c)/2;
        double cevre = 2*u;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı : " + alan);
    }
}
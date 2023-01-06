import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // n! = 1 * 2 * 3 * 4 * ... * n
        Scanner input = new Scanner(System.in);
        int total = 1, total2 = 1, total3 = 1, r, z;
        int combination;
        System.out.print("Faktöriyel Sayısını(n) Giriniz : ");
        int n = input.nextInt();
        System.out.print("r sayısını giriniz : ");
        r = input.nextInt();

        z = n - r;
        System.out.println("z = n-r");

        //Faktöriyel Hesaplama
        for (int i = 1; i <= n ; i++){
            total *=i;
        }
        System.out.println("(n) " + n+"! = " + total);

        //Kombinasyon Hesaplama

        for (int j = 1 ; j <= r ; j++){
            total2 *= j;
        }
        System.out.println("(r) " + r+"! = " + total2);

        for (int p =1 ; p <= z ; p++){
            total3 *= p;
        }
        System.out.println("(z) " + z+"! = " + total3);

        System.out.println("Kombinasyon Formülü : C(n,r) = n! / (r! * (n-r)!) ");

        combination = total / (total2 * total3);
        System.out.println("Kombinasyon --> (C(" + n +","+ r + ")) : " + combination);

    }
}
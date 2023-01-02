import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fiyat;
        System.out.print("Fiyatu giriniz : ");
        fiyat = input.nextDouble();
        double kdv = fiyat/100*18;
        double toplam = fiyat + kdv;

        System.out.println("KDV'siz Fiyat : " + fiyat);
        System.out.println("KDV'li fiyat : " + toplam);
        System.out.println("KDV tutarı : " + kdv);


    }
}
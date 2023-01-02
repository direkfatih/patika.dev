import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fiyat;
        System.out.print("Fiyatu giriniz : ");
        fiyat = input.nextDouble();
        double kdv;

        if (fiyat <= 1000){
            kdv = 18;
        } else {
            kdv = 8;
        }

        double kdvTutar = fiyat/100*kdv;
        double toplam = fiyat + kdvTutar;

        System.out.println("KDV'siz Fiyat : " + fiyat);
        System.out.println("KDV'li fiyat : " + toplam);
        System.out.println("KDV tutarı : " + kdvTutar);


    }
}
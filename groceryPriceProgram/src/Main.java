import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kilogram prices of fruits and vegetables

        Scanner input = new Scanner(System.in);

        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5.00;

        double pearKg, appleKg, tomatoKg, bananaKg, aubergineKg;

        System.out.print("Kaç kilo armut aldınız : ");
        pearKg = input.nextDouble();
        System.out.print("Kaç kilo elma aldınız : ");
        appleKg = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız : ");
        tomatoKg = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız : ");
        bananaKg = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız : ");
        aubergineKg = input.nextDouble();

        double pearPrice, applePrice, tomatoPrice, bananaPrice, auberginePrice;
        pearPrice = pear * pearKg;
        applePrice = apple * appleKg;
        tomatoPrice = tomato * tomatoKg;
        bananaPrice = banana * bananaKg;
        auberginePrice = aubergine * aubergineKg;

        double total =pearPrice + applePrice + tomatoPrice + bananaPrice + auberginePrice;
        System.out.println("Toplam tutar : " + total);

    }
}
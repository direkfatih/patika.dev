import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scan.nextInt();

        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();

            result += number;
        }
        System.out.println("Sonuç : " + result);
        System.out.println("=================================");
    }

    static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scan.nextInt();

        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();

            result -= number;
        }
        System.out.println("Sonuç : " + result);
        System.out.println("=================================");
    }

    static void times(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scan.nextInt();

        int number, result = 1;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (number == 0){
                result = 0;
                break;
            }
            result *= number;

        }
        System.out.println("Sonuç : " + result);
        System.out.println("=================================");
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number ;
        double result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                break;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;

        }
        System.out.println("Sonuç : " + result);
        System.out.println("=================================");
    }

    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1 ; i <= exponent ; i++){
            result *= base;
        }
        System.out.println("Sonuç : " + result);
        System.out.println("=================================");
    }

    static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1 ; i <= n ; i++){
            result *=i;
        }
        System.out.println("Sonuç : " + result);
        System.out.println("=================================");
    }

    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Mod alınacak sayıyı giriniz : ");
        int number = scan.nextInt();
        System.out.print("Mod'u giriniz : ");
        int modNumber = scan.nextInt();
        int result;

        result = number % modNumber;
        System.out.println("Mod : " + result);
    }

    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz : ");
        int longEdge = scan.nextInt();
        System.out.print("Kısa kenarı giriniz : ");
        int shortEdge = scan.nextInt();

        int environment = (shortEdge + longEdge) * 2;
        int area = shortEdge * longEdge;

        System.out.println("Dikdörtgen Çevresi : " + environment);
        System.out.println("Dikdörtgen Alanı : " + area);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";


        while (true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = scan.nextInt();

            switch (select) {
                case 0:
                    System.out.println("İyi Günler!");
                    System.exit(0);
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, Lütfen tekrar deneyiniz!");
            }
        }
    }
}
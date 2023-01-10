import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Armstrong Sayıyılar Bulma

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

        // Basamak Sayılarının Toplamını Hesaplama

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen sayıyı giriniz:" );
        int count = inp.nextInt();
        int tempnumber = number;
        int digit = 0;
        int value, a = 0;

        // a = sonuç, digit = basamak sayısı

        while (tempnumber != 0) {
            tempnumber /= 10;
            digit++;
        }

        tempnumber = count;
        while (tempnumber != 0) {
            value = tempnumber % 10;
            a += value;
            tempnumber /= 10;
        }
        System.out.println(a);



    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //BMI = Body Mass Index/Vücut Kitle İndeksi

        Scanner input = new Scanner(System.in);

        double height;
        int weight;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextInt();

        double index = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz : " + index);

    }
}
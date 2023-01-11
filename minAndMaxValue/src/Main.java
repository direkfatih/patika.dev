import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, max = 0, min = 854584153;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(i+". sayıyı giriniz : ");
            number = input.nextInt();
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }

        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);


    }
}
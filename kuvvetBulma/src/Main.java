import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();

        for (int i = 1 ; i < n ; i *= 4){

            System.out.println("4'ün Kuvvetleri : "  + i);
        }
        System.out.println("-------------------------------");
        for (int j = 1 ; j < n ; j *= 5){
            System.out.println("5'in Kuvvetleri : "  + j);
        }
    }
}
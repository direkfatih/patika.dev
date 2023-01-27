import java.util.Scanner;

public class Main {

    static int exponential(){
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        int n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        int k = input.nextInt();
        int total = 1;

        for (int i = 1 ; i <= k ; i++){
            total *= n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(exponential());

    }
}
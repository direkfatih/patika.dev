import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, sum = 0, count = 0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        //Çift sayıları bulma
        for (int i = 1; i <= number; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= number; i++){
            if (i % 3 == 0 & i % 4 == 0){
                sum += i;
                count++;
            }
        }
        System.out.println("--------------");

        average = sum / count;
        System.out.println("Ortalama : " + average);


    }
}
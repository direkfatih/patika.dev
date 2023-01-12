import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci Serisi istiyorsunuz : ");
        int count = input.nextInt();
        int firstTerm = 0, secondTerm = 1, currentTerm;

        System.out.print(firstTerm + " " + secondTerm);

        for (int i = 2 ; i <= count ; i++){
            currentTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = currentTerm;
            System.out.print(" " + currentTerm);
        }


    }
}
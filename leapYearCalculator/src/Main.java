import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Yılı Giriniz : ");
        year = input.nextInt();

        if (year % 100 == 0){
            if (year % 400 == 0) {
                System.out.println(year + " Artık Yıldır.");
            }else {
                System.out.println(year + " Artık Yıl Değildir.");
            }
        }else if (year % 4 == 0 ) {
            System.out.println(year + " Artık Yıldır.");
        }else {
            System.out.println(year + " Artık Yıl Değildir.");
        }


    }
}
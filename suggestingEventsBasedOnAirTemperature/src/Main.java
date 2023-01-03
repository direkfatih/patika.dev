import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Hava " + heat + " derece kayak yapabilirsiniz.");
        }else if(5 <= heat && heat < 10){
            System.out.println("Hava " + heat + " derece sinemaya gidebilirsiniz.");
        }else if (10 <= heat && heat <= 15){
            System.out.println("Hava " + heat + " derece, bu havada sinemaya veya pikniğe gidebilirsiniz.");
        } else if(15 < heat && heat <= 25){
            System.out.println("Hava " + heat + " derece, bu sıcak havada sahilde piknik yapabilirsiniz.");
        }else if (25 < heat){
            System.out.println("Hava " + heat + " derece, bu aşırı sıcak havada yüzmeye gidebilirsiniz.");
        }else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
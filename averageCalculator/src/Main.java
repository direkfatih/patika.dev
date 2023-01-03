import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        if (0 <= matematik && matematik <= 100 && 0 <= fizik && fizik <= 100 && 0 <= turkce && turkce <= 100
                && 0 <= kimya  && kimya <= 100 && 0 <= muzik && muzik <= 100){
            average = (matematik + fizik + turkce + kimya + muzik) / 5;
            System.out.println("not Ortalamanız : " + average);
        }else {
            System.out.println("Hatalı Not Girişi Yaptınız. Notlarınız 0 <= x <= 100 aralığında olmalıdır.");
        }

        average = (matematik + fizik + turkce + kimya + muzik) / 5;

        if (average >= 55 ){
            System.out.println("Tebrikler, Geçtiniz");
        }else {
            System.out.println("Maalesef, Kaldınız!");
        }


    }
}
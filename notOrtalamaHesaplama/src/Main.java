import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        double toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;

        System.out.println("Not Ortalamanız : " + ortalama);
        String sonuc = (ortalama >= 60)? "Geçtiniz" : "Kaldınız";
        System.out.print(sonuc);

    }
}
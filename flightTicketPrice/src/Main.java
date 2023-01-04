import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, age, tripType;
        Scanner input = new Scanner(System.in);
        double perkm = 0.10, totalPrice, discountPrice, discountPrice2, kidDiscount = 0.50, normalDiscount = 0.10, oldDiscount = 0.30, returnTicket = 0.20;

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz(1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        tripType = input.nextInt();

        double price = km * perkm;

        if (tripType == 1 ){
            if (age < 12){
                discountPrice = price * kidDiscount;
                totalPrice = price - discountPrice;
                System.out.println("Toplam tutar : " + totalPrice);
            }else if (12 <= age && age <= 24){
                discountPrice = price * normalDiscount;
                totalPrice = price - discountPrice;
                System.out.println("Toplam tutar : " + totalPrice);
            }else if (65 <= age){
                discountPrice = price * oldDiscount;
                totalPrice = price - discountPrice;
                System.out.println("Toplam tutar : " + totalPrice);
            }else {
                totalPrice = price;
                System.out.println("Toplam tutar : " + totalPrice);
            }
        }else if (tripType == 2){
            if (age < 12){
                discountPrice = price * kidDiscount;
                totalPrice = (price - discountPrice) * 2;
                discountPrice2 = totalPrice - (totalPrice * returnTicket);
                System.out.println("Toplam tutar : " + discountPrice2);
            }else if (12 <= age && age <= 24){
                discountPrice = price * normalDiscount;
                totalPrice = (price - discountPrice) * 2;
                discountPrice2 = totalPrice - (totalPrice * returnTicket);
                System.out.println("Toplam tutar : " + discountPrice2);
            }else if (65 <= age){
                discountPrice = price * oldDiscount;
                totalPrice = (price - discountPrice) * 2;
                discountPrice2 = totalPrice - (totalPrice * returnTicket);
                System.out.println("Toplam tutar : " + discountPrice2);
            }else {
                totalPrice = price * 2;
                discountPrice2 = totalPrice - (totalPrice * returnTicket);
                System.out.println("Toplam tutar : " + discountPrice2);
            }
        }else {
            System.out.println("Hatalı Giriş Yaptınız! Lütfen Tekrar Deneyiniz.");
        }








    }
}
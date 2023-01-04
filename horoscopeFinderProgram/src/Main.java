import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        String sign;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Gün : ");
        day = input.nextInt();


        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    sign = "Oğlak Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                } else {
                    sign = "Kova Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            } else {
                System.out.print("1.ay 31 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 2){
            if (day >= 1 && day <= 28){
                if (day <= 19){
                    sign = "Kova Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "Balık Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("2.ay 28 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 3){
            if (day >= 1 && day <= 31){
                if (day <= 20){
                    sign = "Balık Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "Koç Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("3.ay 31 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 4){
            if (day >= 1 && day <= 30){
                if (day <= 20){
                    sign = "Koç Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "Boğa Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("4.ay 30 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 5){
            if (day >= 1 && day <= 31){
                if (day <= 21){
                    sign = "Boğa Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "İkizler Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("5.ay 31 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 6){
            if (day >= 1 && day <= 30){
                if (day <= 22){
                    sign = "İkizler Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "Yengeç Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("6.ay 30 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 7){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    sign = "Yengeç Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "Aslan Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("7.ay 31 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 8){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    sign = "Aslan Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "Başak Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("8.ay 31 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 9){
            if (day >= 1 && day <= 30){
                if (day <= 22){
                    sign = "Başak Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "Terazi Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("9.ay 30 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 10){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    sign = "Terazi Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "Akrep Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("10.ay 31 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 11){
            if (day >= 1 && day <= 30){
                if (day <= 21){
                    sign = "Akrep Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "Yay Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("11.ay 30 gündür, geçersiz giriş yaptınız.");
            }
        }else if (month == 12){
            if (day >= 1 && day <= 30){
                if (day <= 21){
                    sign = "Yay Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }else {
                    sign = "Oğlak Burcu";
                    System.out.println("Merhaba, Burcunuz : " + sign);
                }
            }else {
                System.out.println("12.ay 30 gündür, geçersiz giriş yaptınız.");
            }
        }else {
            System.out.println("Hatalı Giriş Yaptınız.");
        }
    }
}
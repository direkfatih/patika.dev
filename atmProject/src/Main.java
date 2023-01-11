import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 4500;
        int select;

        while (right > 0){
            System.out.print("Kullanıcı Adı : ");
            userName = input.nextLine();
            System.out.print("Parola : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Java Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1- Para yatırma\n" +
                            "2- Para çekme\n" +
                            "3- Bakiye sorgula\n" +
                            "4- Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Güncel Bakiyeniz : " + balance);
                            continue;
                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarı : ");
                            price = input.nextInt();
                            if (price > balance){
                                System.out.println("Bakiye Yetersiz!");
                            }else {
                                balance -= price;
                                System.out.println("GÜncel bakiyeniz : " + balance);
                            }
                            continue;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                    }
                }while (select != 4);
                System.out.println("Hesabınızdan Çıkış Yapıldı. İyi Günler.");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre girişi yaptınız. Tekrar deneyiniz.");
                if (right == 0){
                    System.out.println("Heabınız bloke olmuştur! Lütfen banka ile iletişime geçiniz.");
                }else{
                System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
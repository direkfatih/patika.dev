import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password,yesOrNo;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else if(!userName.equals("patika") && !password.equals("java123")){
            System.out.println("Hatalı Kullanıcı Adı ve Şifre Girişi Yaptınız!");
        }else if(!userName.equals("patika") && password.equals("java123")){
            System.out.println("Hatalı Kulanıcı Adı Girişi Yaptınız!");
        }else if(!password.equals("java123")){
            System.out.println("Hatalı Şifre Girişi Yaptınız!");
            System.out.print("Şifrenizi Yenilemek ister misiniz? ");
            yesOrNo = input.nextLine();
            if (yesOrNo.equals("evet")){
                System.out.print("Yeni Şifre Girişi Yapınız: ");
                password = input.nextLine();
                if ((password.equals("java123"))){
                    System.out.println("Şifre Oluşturulamadı!");
                }else {
                    System.out.println("Yeni Şifreniz Oluşturuldu.");
                }
            }else if(yesOrNo.equals("hayır")){
                System.out.println("Giriş Yapılamadı!");
            }else {
                System.out.println("Hatalı Giriş Yaptınız!");
            }
        }else {
            System.out.println("Hatalı Giriş Yaptınız!");
        }
    }
}
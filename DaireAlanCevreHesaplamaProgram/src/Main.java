import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double π = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Daire yarıçapını giriniz : ");
        r = input.nextInt();

        double alan = π * r * r;
        double cevre = 2 * π * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);

        //a = daire diliminin açı ölçüsü
        int a;
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        a = input.nextInt();

        double dilimAlanı = (π * (r*r) * a)/360 ;
        System.out.println("Merkez Açı Alanı : " + dilimAlanı);

    }
}
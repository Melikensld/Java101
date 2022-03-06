import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen 1. kenar uzunluğunu giriniz : ");
        int a = sc.nextInt();

        System.out.print("Lütfen 2. kenar uzunluğunu giriniz : ");
        int b = sc.nextInt();

        System.out.print("Lütfen 3. kenar uzunluğunu giriniz : ");
        int c = sc.nextInt();

        int cevre = a+b+c;
        System.out.println("Çevre : " +cevre);

        double u = cevre / 2.0;
        double alan =Math.sqrt( u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin alanı : " +alan);

    }
}

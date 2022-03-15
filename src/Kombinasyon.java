import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,r;
        int faktoriyeln = 1;
        int faktoriyelr = 1;
        int faktoriyelj = 1;

        System.out.print(" 'n' Değerini Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            faktoriyeln *= i;
        }
        System.out.print(" 'r' Değerini Giriniz : ");
        r = input.nextInt();
        for (int k = 1; k <= r; k++) {

            faktoriyelr *= k;

        }
        for (int j = 1; j <= n - r; j++) {

            faktoriyelj *= j;
        }
        int sonuc = (faktoriyeln) / (faktoriyelr * faktoriyelj);
        System.out.print("C(" + (n) + "," + (r) + ")" + ":" + sonuc);

    }
}
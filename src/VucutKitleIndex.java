import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = sc.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = sc.nextDouble();

        double sonuc = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz : " +sonuc);

    }
}

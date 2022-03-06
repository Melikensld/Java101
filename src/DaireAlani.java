import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {

        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen daire diliminin yarıçapını giriniz : ");
        int r = sc.nextInt();

        System.out.print("Lütfen daire diliminin açısını giriniz : ");
        int aci = sc.nextInt();

        double alan = (pi * (r*r) * aci) / 360;
        System.out.println("Daire diliminin alanı : " +alan);
    }
}

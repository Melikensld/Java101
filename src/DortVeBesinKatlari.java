import java.util.Scanner;
public class DortVeBesinKatlari {
    public static void main(String[] args) {

        int sayi;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();

        for ( int i = 1; i <= sayi; i *= 4) {
            System.out.print(i + ",");
        }System.out.println(" (4'ün Katları)  ");


        for ( int i = 1; i <= sayi; i *= 5){
            System.out.print(i + ",");
        }System.out.println(" (5'in Katları)  ");


    }
}
import java.util.Scanner;

public class UcVeDordeBolunme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = input.nextInt();

        int i = 0;
        double sum = 0, count = 0;
        while (i <= sayi) {
            i++;
            if (i % 3 == 0 && i % 4 == 0) {
                sum = sum + i;
                count++;
            }
        }
        double ortalama = sum / count;
        System.out.println("Girdiğiniz sayıya kadar olan 3 ve 4'e tam bölünen sayıların ortalaması : " + ortalama);
    }
}

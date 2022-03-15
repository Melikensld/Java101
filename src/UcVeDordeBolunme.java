import java.util.Scanner;

public class UcVeDordeBolunme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int sayi = input.nextInt();

        for(int i = 0; i < sayi; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}

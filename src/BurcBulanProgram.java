import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz : ");
        int ay = scanner.nextInt();
        System.out.print("Doğduğunuz günü giriniz : ");
        int gun = scanner.nextInt();

        if(ay == 1) {
            if (gun <= 21)
                System.out.println("Oğlak Burcu");
            else
                System.out.println("Kova Burcu");
        }
        if(ay == 2){
            if(gun <= 19)
                System.out.println("Kova Burcu");
            else
                System.out.println("Balık Burcu");
        }
        if(ay == 3){
            if (gun <= 20)
                System.out.println("Balık Burcu");
            else
                System.out.println("Koç Burcu");
        }
        if(ay == 4){
            if(gun <= 20)
                System.out.println("Koç Burcu");
            else
                System.out.println("Boğa Burcu");
        }
        if(ay == 5){
            if(gun <= 21)
                System.out.println("Boğa Burcu");
            else
                System.out.println("İkizler Burcu");
        }
        if(ay == 6){
            if(gun <= 22)
                System.out.println("İkizler Burcu");
            else
                System.out.println("Yengeç Burcu");
        }
        if(ay == 7){
            if(gun <= 22)
                System.out.println("Yengeç Burcu");
            else
                System.out.println("Aslan Burcu");
        }
        if(ay == 8){
            if(gun <= 22)
                System.out.println("Aslan Burcu");
            else
                System.out.println("Başak Burcu");
        }
        if(ay == 9){
            if(gun <= 22)
                System.out.println("Başak Burcu");
            else
                System.out.println("Terazi Burcu");
        }
        if(ay == 10){
            if(gun <= 22)
                System.out.println("Terazi Burcu");
            else
                System.out.println("Akrep Burcu");
        }
        if(ay == 11){
            if(gun <= 21)
                System.out.println("Akrep Burcu");
            else
                System.out.println("Yay Burcu");
        }
        if(ay == 12){
            if(gun <= 21)
                System.out.println("Yay Burcu");
            else
                System.out.println("Oğlak Burcu");
        }
    }
}
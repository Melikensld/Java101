import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Base : ");
        int x = sc.nextInt();
        System.out.print("Exponent : ");
        int y = sc.nextInt();

        int total = 1;

        for (int i=1;i<=y;i++) {
            total*=x;
            //System.out.println(total);
        }
        System.out.println("Total : "+ total);
    }
}
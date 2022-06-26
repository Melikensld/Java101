import java.util.Scanner;

public class YildizlarlaTersUcgen{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Basamak sayisi giriniz: ");
        int n= input.nextInt();
        int x = 1;
        for(int i = (n-1); i > 0; i--){
            for(int j = 0; j < x; j++)
                System.out.print(" ");
            x += 1;
            for(int k=0; k < (i*2)-1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi,total=0;
        Scanner inp=new Scanner(System.in);

        System.out.println("Please enter the number: ");
        sayi=inp.nextInt();

        for(int i=1; i<sayi; i++){

            if(sayi%i==0){
                total+=i;
            }
        }if(sayi==total){
            System.out.println(sayi+"\n" +
                    "is the perfect number.");
        }else{
            System.out.println(sayi+"\n" +
                    "is not a perfect number");
        }

    }
}
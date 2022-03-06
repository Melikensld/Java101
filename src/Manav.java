import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        armut *= sc.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        elma *= sc.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        domates *= sc.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        muz *= sc.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlican *= sc.nextDouble();

        System.out.println("Toplam tutar : " +(armut+elma+domates+muz+patlican));

    }
}

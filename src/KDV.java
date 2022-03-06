import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
         /*
        KDV Tutarı Hesaplayan Program
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        */

        double tutar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen ücret tutarını giriniz : ");
        tutar = sc.nextDouble();

        double kdvTutar = (tutar <= 1000) ? (tutar * 0.18) : (tutar * 0.08);
        double kdvliTutar = kdvTutar + tutar;

        System.out.println("KDV'siz tutar : " +tutar);
        System.out.println("KDV tutarı : " +kdvTutar);
        System.out.println("KDV'li tutar : " +kdvliTutar);
    }
}

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
    Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tutar, mesafe, mesafeUcret = 0.10;
        int yolculukTipi, yas;

        System.out.print("Mesafeyi km tipinden giriniz : ");
        mesafe = sc.nextInt();
        tutar = mesafe * mesafeUcret;

        System.out.print("Yaşınızı giriniz : ");
        yas = sc.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        yolculukTipi = sc.nextInt();

        if ((mesafe <= 0) || (yas < 0) || (yolculukTipi != 1 || yolculukTipi != 2))
            System.out.println("Hatalı Veri Girdiniz !");
            System.exit(0);

        if (yas < 12){
            tutar /= 2;
        }else if (yas >= 12 && yas < 24){
            tutar -= tutar * 0.1;
        }else if (yas > 65){
            tutar -= tutar * 0.3;
        }

        if (yolculukTipi == 2)
            tutar *= 2;
            tutar -= tutar * 0.2;

        System.out.println("Toplam Tutar : "+tutar);
    }
}

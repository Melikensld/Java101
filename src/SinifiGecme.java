import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fizik, turkce, kimya, muzik, toplam = 0, ortalama;
        int sayac = 0;

        System.out.print("Matematik notunuz: ");
        mat = input.nextDouble();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            sayac++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextDouble();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            sayac++;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextDouble();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            sayac++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextDouble();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            sayac++;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextDouble();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            sayac++;
        }

        ortalama = toplam / sayac;

        System.out.println("Ortalamanız : " + ortalama);

        if (ortalama >= 55) {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
    }
}
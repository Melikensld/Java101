import java.util.Scanner;

public class KullaniciGirisSistemi {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız !");
        } else{
            System.out.println("Bilgileriniz yanlış !");
            System.out.println("Şifreyi sıfırlamak ister misiniz ?\n1-Evet\n2-Hayır");

            int select = input.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Yeni şifreniz : " + input.nextLine());
                    String newPassword = input.nextLine();

                    if (newPassword.equals("java123")) {
                        System.out.println("Yeni şifreniz eskisi ile aynı olamaz");

                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                    break;

                case 2:
                    System.out.println("Daha sonra tekrar deneyiniz, iyi günler.");
                    break;
            }

        }
    }
}

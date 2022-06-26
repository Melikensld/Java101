import java.util.Scanner;

public class ArmstrongSayilari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int x=1;x<1000;x++) {
            int counter = 0;
            int termx = x;
            int termx2 = x;
            int exp, t;
            int result = 0;

            while (termx != 0) {
                termx = termx / 10;
                counter++;
            }

            for (int i = 0; i < counter; i++) {
                t = termx2 % 10;
                exp = (int) Math.pow(t, counter);
                termx2 = termx2 / 10;
                result += exp;

            }
            if (result == x) {
                System.out.println(result);
            }
        }
    }
}
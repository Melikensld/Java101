package BoksMaci;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Sophia",10,100,100, 50);
        Fighter f2 = new Fighter("Daniel",10,100,100, 50);

        Match match = new Match(f1,f2,85,100);
        match.StartRun();
    }
}
package Boks;

public class Driver {
    public static void main(String[] args) {
        Fighter F1 = new Fighter("Osman", 10, 120, 100);
        Fighter F2 = new Fighter("Dalga", 20, 85, 85);

        Match match = new Match(F1, F2, 85, 100);
        match.run();

    }
}

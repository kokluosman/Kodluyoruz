import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double km=2.20;
        int acilis= 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gidilecek mesafe kaç kilometre?");
        double yol = scanner.nextDouble();
        scanner.close();
        double sonuc = acilis+(yol*km);
        System.out.print(sonuc<=20 ? 20:sonuc);
    }
}

import java.util.Scanner;
public class MeyveKiloHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç kilo ?");
        double armut = scanner.nextDouble();
        System.out.print("elma Kaç kilo ?");
        double elma = scanner.nextDouble();
        System.out.print("domates Kaç kilo ?");
        double domates = scanner.nextDouble();
        System.out.print("muz Kaç kilo ?");
        double muz = scanner.nextDouble();    
        System.out.print("patlıcan Kaç kilo ?");
        double patlıcan = scanner.nextDouble();
        scanner.close();
        double toplam = (armut*2.14)+(elma*3.67)+(muz*0.95)+(patlıcan*5.0)+(domates*1.11);
        System.out.print("Toplam Tutar: "+toplam);
    }
}

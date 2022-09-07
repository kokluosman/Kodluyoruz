import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz (Kilogram Cinsinden)");
        double kilo = scanner.nextDouble();
        System.out.print("Boy değerinizi giriniz (Metre Cinsinden)");
        double boy = scanner.nextDouble();
        scanner.close();
        double sonuc = kilo/(boy*boy);
        System.out.print("Vücut Kitle Endeksiniz: " + sonuc);
       
    }
}

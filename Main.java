import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz");
        int mat = scanner.nextInt();
        System.out.println("Fizik Notunuzu Giriniz");
        int fizik = scanner.nextInt();
        System.out.println("Kimya Notunuzu Giriniz");
        int kimya = scanner.nextInt();
        System.out.println("Turkce Notunuzu Giriniz");
        int turkce = scanner.nextInt();
        System.out.println("Tarih Notunuzu Giriniz");
        int tarih = scanner.nextInt();
        System.out.println("Muzik Notunuzu Giriniz");
        int Muzik = scanner.nextInt();
        
        double toplam = (mat+fizik+kimya+tarih+turkce+Muzik)/6;
        System.out.print(toplam >= 60 ? "Geçti":"Kaldı");

    }
}
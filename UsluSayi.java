import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üssü alınacak sayıyı giriniz");
        int sayi = scanner.nextInt();
        System.out.println("Lütfen üs değerini giriniz");
        int number = scanner.nextInt();
        scanner.close();
        int toplam = 1;
        for (int i = 1; i <=number; i++) {
            toplam *=sayi;
        }
        System.out.println("Üs Değeri: " + toplam);
    }
}

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Sayıları sırayla Giriniz.\nÖrneğin C(6,2) önce 6 sonra 2 giriniz.");
        int sayi = scanner.nextInt();
        int number = scanner.nextInt();
        scanner.close();
        int toplam = 1;
        for (int i = 1; i <= sayi; i++) {
            toplam *=i; 
        }
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total *=i;
        }
        int totall =1;
        for (int i = 1; i <= (sayi-number); i++) {
            totall *= i;
        }
        System.out.println("Cevap: " + (toplam/(total*totall)));
    }
}

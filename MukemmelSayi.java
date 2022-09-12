import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı gir:");
        int sayi = scanner.nextInt();
        scanner.close();
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0){
                toplam += i;
            }
        }
        System.out.println(sayi == toplam ? "mükemmel sayi": " Mükemmel sayi degil.");
    }
}

import java.util.Scanner;

public class HarmonikNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("n Sayısını giriniz");
        int n = scanner.nextInt();
        double toplam =0;
        scanner.close();
        for (double i = 1; i <=n; i++) {
            toplam = toplam +(1/i);
        }
        System.out.println(toplam);
    }
}

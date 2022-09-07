import java.util.Scanner;

public class KDVCalculate{
    public static void main(String[] args) {
        System.out.print("Para Miktarını Giriniz");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        double kdv = (money>0) && (money<1000) ? 0.18 : 0.8;
        scanner.close();
        double sonuc = money + (money*kdv);

        System.out.print("Kdvli Fiyat: "+sonuc+"\nKDV: "+kdv+"\nAnaPara: "+money);

    }
}
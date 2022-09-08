import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1:Toplama // 2: Çıkarma // 3: Çarpma // 4: Bölme // 5: Mod Alma");
        System.out.println("Yapmak istediğiniz işlemi seçin. Ardından iki sayı değerini giriniz");
        int islem = scanner.nextInt();
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();
        scanner.close();

        switch (islem) {
            case 1:
            System.out.println(sayi1 + sayi2);
                break;
            case 2:    
            System.out.println(sayi1 - sayi2);
                break;
            case 3:
            System.out.println(sayi1 * sayi2);
                break;
            case 4:
            System.out.println(sayi1 / sayi2);
                break;
            case 5:
            System.out.println(sayi1 % sayi2);
                break;
            default:
                break;
        }
    }
}

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Cevabını Aradığınız Sayıyı Giriniz.");
        int number = scanner.nextInt();
        int armnumber = number;
        scanner.close();
        String len = String.valueOf(number);
        int us = len.length()-1;
        int uss = us+1;
        double toplam =0;
        int x = (int)Math.pow(10, us);
        for (int i = us; i >= 0; i--) {
            int arm = number/x;
            toplam += Math.pow(arm, uss);
            arm = number%x;
            number = arm;
            x=x/10;
        }
        System.out.println("Sonuç Değeri: "+toplam);
        System.out.println("Number: "+armnumber);
        System.out.println((toplam == armnumber) ? "Armstrong Sayı":"Armstrong Sayı Değil");
        
    }
}

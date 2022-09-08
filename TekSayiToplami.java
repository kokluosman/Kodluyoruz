import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        System.out.println("Sayı Giriniz.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int toplam =0;
        while(number>0){
            if(number%2==0){
                toplam = toplam+0;
            }
            else if(number ==1){
                toplam = toplam +number;
            }else{
                toplam = toplam+number;
            }
            System.out.println("Sayı Giriniz...");
            number = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Toplam: " + toplam);
    }
}

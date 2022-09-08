import java.util.Scanner;

public class UcakBiletiHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz");
        int mesafe = scanner.nextInt();
        System.out.println("Yolcu yaşını seçiniz ");
        int yas = scanner.nextInt();
        System.out.println("Yolculuk tipi --> 1:(Tek Yön)\n2:(Gidiş-Dönüş) (1 veya 2 seçiniz.)");
        int tip = scanner.nextInt();
        double toplam = mesafe * 0.10;
        scanner.close();
        System.out.println("Toplam Fiyat: " + toplam);
        switch (tip) {
            case 1:
                if(yas>0 && yas<=12){
                    toplam = toplam*0.5;
                    System.out.println("İndirimli Fiyat: " + toplam);
                }else if(yas>=12 && yas<=24){
                    toplam = toplam-(toplam*0.1);
                    System.out.println("İndirimli Fiyat: " + toplam);
                }else if(yas >= 65){
                    toplam = toplam * (toplam*0.3);
                    System.out.println("İndirimli Fiyat: " + toplam);
                }else if(yas>=25 && yas<=64){
                    System.out.println("İndirimli Fiyat Yok " + toplam);
                }else{
                    System.out.println("Yanlış veri girdiniz.");
                }
                break;
            case 2:
                toplam = toplam -(toplam*0.2)*2;
            if(yas>0 && yas<=12){
                toplam = toplam*0.5;
                System.out.println("İndirimli Fiyat: " + toplam);
            }else if(yas>=12 && yas<=24){
                toplam = toplam-(toplam*0.1);
                System.out.println("İndirimli Fiyat: " + toplam);
            }else if(yas >= 65){
                toplam = toplam * (toplam*0.3);
                System.out.println("İndirimli Fiyat: " + toplam);
            }else if(yas>=25 && yas<=64){
                System.out.println("İndirimli Fiyat: " + toplam);
            }else{
                System.out.println("Yanlış veri girdiniz.");
            }
                break;
            default:
                System.out.println("Yanlış Giriş Yaptınız. 1 veya 2 giriniz.");
        }
        
    }
}

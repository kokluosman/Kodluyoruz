import java.util.Scanner;

public class CiftTek {
    public static void main(String[] args) {
        System.out.println("Pozitif Tam Sayı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        //Burası tek çift sayı bulma yeridir.
        /*for (int i = 1; i <=number; i++) {
            if(i==1){
                System.out.println( i + " Tek Sayıdır. ");
            }else if(i%2==0){
                System.out.println(i + " Çif Sayıdır.");
            }else {
                System.out.println(i + " Tek Sayıdır.");
            }
        }*/
        int sayac = 0;
        int toplam =0;
        for (int i = 1; i <=number; i++) {
            if((i%3==0)&&(i%4==0)){
                sayac++;
                toplam +=i;
            }
        }
        System.out.println("Cevap: "+(toplam/sayac));
    }   
}

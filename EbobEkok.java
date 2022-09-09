import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sayıyı Giriniz.");
        int say1 = scanner.nextInt();
        System.out.println("2. Sayıyı Giriniz.");
        int say2 = scanner.nextInt();
        scanner.close();
        int ebob =1;
        int ekok =1;
        for (int i = 1; i <=say1; i++) {
            if(say1%i== 0 && say2%i==0){
                ebob = i; 
            }else if(say1%i ==0 || say2%i==0){
                ekok = say1*say2/ebob;
            }

        }
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}

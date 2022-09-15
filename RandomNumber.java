import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int select = scanner.nextInt();;
        int[] wrong = new int[5];
        scanner.close();
        while(right<5){
            System.out.println("Lütfen tahmininizi giriniz.");

            if(select<0 || select>99){
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");
                continue;
            }
            if(select == number){
                System.out.println("Tebrikler " + number +" Doğru sayı.");
                break;
            }else{
                wrong[right] = select;
                right++;
                System.out.println("Hatalı Sayı Girdiniz.");
                if(select>number){
                    System.out.println("Sayıyı Küçültünüz");
                }else{
                    System.out.println("Sayıyı Büyütünüz");
                } 
                System.out.println("Kalan hakkınız: " + (5-right) );
            }
            
            
        }

    }
}

import java.util.Scanner;

public class IkininKuvveti {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sayıyı Giriniz");
            int number = scanner.nextInt();
            scanner.close();
            for (int i = 1; i <=number; i*=2) {
                System.out.println("Sayılar: " + i);
            }
        
    

    }
}
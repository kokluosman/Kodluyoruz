import java.util.Scanner;

public class UsAlma {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Önce taban sonra üs değerini giriniz.");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(pow(n1,n2));
        scanner.close();

    }

    static int pow(int base,int exponent){
        if (base == 1 | exponent == 0) {
            return 1;
        }
        return pow(base,exponent-1)*base;
    }
}

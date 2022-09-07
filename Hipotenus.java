import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dik kenar uxunluklarını giriniz.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = Math.pow(a,2) + Math.pow(b, 2);
        c= Math.pow(c, 0.5);
        scanner.close();
        System.out.print("Sonuc: " + c );  
        
        double cevre = (a+b+c)/2;
        double alan = cevre*(cevre-a)*(cevre-b)*(cevre*c) ;
        alan = Math.pow(alan, 0.5);
        System.out.print("Alan: "+alan);
    }
}

import java.util.Scanner;

public class Sirala {
    public static void main(String[] args) {
        System.out.println("3 tane tam sayı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int s  = scanner.nextInt();
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        scanner.close();
        if((s>s1 && s>s2) && s1>s2){
            System.out.println(s +" " + s1  + " " + s2 );
        }else if((s>s1 && s>s2) && s1<s2){
            System.out.println(s +" " + s2  + " " + s1 );
        }else if((s1>s && s1>s2) && s>s2){
            System.out.println(s1 +" " + s  + " " + s2 );
        }else if((s1>s && s1>s2) && s2>s){
            System.out.println(s1 +" " + s2  + " " + s );
        }else if((s2>s && s2>s1) && s>s1){
            System.out.println(s2 +" " + s  + " " + s1 );
        }else if((s2>s && s2>s1) && s1>s){
            System.out.println(s2 +" " + s1  + " " + s );
        }else{
            System.out.println("Eşit sonuçar olabilir");
        }
    }
}

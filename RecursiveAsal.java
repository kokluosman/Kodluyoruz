import java.util.Scanner;

public class RecursiveAsal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı Giriniz: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(usAl(number));
    }

    static int usAl(int number){
        int sayac=0;
        if(number ==2){
            return 1;
        }else{
            for (int i = 2; i < number; i++) {
                if(number%i==0){
                    
                }else{
                    sayac = sayac+1;
                    return sayac;
                }
            }
            return usAl(number)-1;
        }

    }

}

import java.util.Scanner;

public class YildizBasamakli {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n;
        System.out.print("Basamak sayısını girin :");
        n=input.nextInt();

        System.out.println("");

        for (int i=(n-1);i>=1;i--){
            for (int k=1; k<=(n-i);k++){
                System.out.print(" ");
            }
            for (int a=1;a<=((2*i )-1);a++){
                System.out.print("*");
            }
            System.out.println(" ");




        }
    }
}

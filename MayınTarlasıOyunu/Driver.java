package MayınTarlasıOyunu;

import java.util.Scanner;

public class Driver {
    
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int data;
                try{
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    data = x/y;
                    System.out.println(data);
                }catch(Exception e){
                    System.out.println(e.toString());
                }//catch(ArithmeticException e){
                    //System.out.println(e.getMessage());
               // }
                
        }


    
}

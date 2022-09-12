

public class RecursiveFibonacci {
    public static void main(String[] args) {
      
        System.out.println(fibo(6));
       
    }

    static int fibo(int number){
        if(number == 1 || number == 2){
            return 1;
        }else{
            return fibo(number-1)+ fibo(number-2);
        }
    }

}

public class Palidrom {
    public static void main(String[] args) {
        
        System.out.println(" " + isPalindrom(2002));

    }

    static boolean isPalindrom(int number){
        int temp = number, reversenumber =0,lastNumber;
    while(temp!=0){
        lastNumber = temp %10;
        reversenumber = (reversenumber*10)+lastNumber;
        temp/=10;
    }
    if(number == reversenumber){
        return true;
    }
    else{
        return false;
    }
    
    }
}

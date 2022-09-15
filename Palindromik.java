public class Palindromik {
    public static void main(String[] args) {
        System.out.println(isPalidrome2("kabak"));
        
    }

    static boolean isPalidrome2(String str){
        String reverse  = "";
        for (int i = str.length()-1; i >=0; i--) {
            reverse = reverse+str.charAt(i);
        }
        return reverse.equals(str); 

    }


    static boolean isPalidrome(String str){
        int i =0;
        int j= str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

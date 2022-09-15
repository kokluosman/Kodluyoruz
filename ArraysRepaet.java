public class ArraysRepaet {
    public static void main(String[] args) {
        int sayac=0;
        int[] liste = {3,7,3,3,2,9,10,21,1,33,9,1};
        for (int i = 0; i < liste.length; i++) {
            System.out.println(liste[i]+"///////");
            for (int j = 0; j < liste.length; j++) {
                if(liste[i]==liste[j]){
                    
                    sayac=sayac+1;
                }
                
            }
            System.out.println("Sayac: " + sayac);
            sayac =0; 
            
        }
    }
}

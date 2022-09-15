public class ArraysFrequency {
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,10,20,5,20};
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    sayac++;
                }
            }
            System.out.println(arr[i]+" sayısı " + sayac+" Defa Tekrar Etmiştir.");
            sayac=0;
        }
    }
}

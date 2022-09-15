public class ArraysOrt {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,1,10,30,4,1,2};
        double average =0;
        for (int i = 0; i < list.length; i++) {
            average +=i; 
        }
        System.out.println(average/list.length);
    }
}

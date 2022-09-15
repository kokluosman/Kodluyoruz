public class MinMaxInArray {
    public static void main(String[] args) {
        int[] list = {2,98,46,1,3,5,7,4,45,87,42,83,55,6,4,93,72,15,63,48,108};
        int max = list[0];
        int min = list[0];

        for (int i = 0; i < list.length; i++) {
            if(max<=list[i]){
                max = list[i];
            } 
            if(min>=list[i]){
                min = list[i];
            }
        }
        System.out.println("Min: " + min + "\t" + "Max: " + max);
    }
}

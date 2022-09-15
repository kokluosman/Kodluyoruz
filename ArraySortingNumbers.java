import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi Boyutunu seçiniz.");
        int b = scanner.nextInt();
        int[] series = new int[b];
        for (int i = 0; i < series.length; i++) {
            System.out.println((i+1)+".Elemanı giriniz: ");
            series[i] = scanner.nextInt();
        }
        for (int i = 0; i < series.length; i++) {
            for (int j = i+1; j < series.length; j++) {
                if(series[i]>series[j]){
                    int temp = series[i];
                    series[i] = series[j];
                    series[j]=temp;
                }
            }
        }
        scanner.close();
        System.out.println(Arrays.toString(series));
    }
}

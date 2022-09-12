import java.util.ArrayList;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int loops;
        System.out.println("Kaç tane tam sayı gireceksiniz?");
        Scanner scanner = new Scanner(System.in);
        loops = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= loops; i++) {
            arrayList.add(scanner.nextInt());
        }
        int min = arrayList.get(0);
        int max = arrayList.get(0);
        System.out.println("------------");
        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i)>max){
                System.out.println(arrayList.get(i));
                max = i;
            }
            if(arrayList.get(i)<min){
                min = i;
            }
        }
        scanner.close();
        System.out.println("------------");
        System.out.println(arrayList);
        System.out.println("Min Değer:"+min+"\nMax Değer:"+max);
    }
}

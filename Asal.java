import java.util.ArrayList;

public class Asal {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        for (int i = 2; i <= 100; i++) {
            if(i%2==0 || i%3==0 || i%5==0 || i%7==0){
                
            }else{
                arrayList.add(i);
            }

        }
        System.out.println(arrayList);
    }
}

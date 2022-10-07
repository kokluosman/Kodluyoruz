package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver {
   public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(50);
    list.add(90);
    list.add((null));
    int t = list.size();

    Iterator<Integer> iterator = list.iterator();
    while(iterator.hasNext()){
        Integer iter = iterator.next();
        System.out.println(iter);
    }
    System.out.println(t);
   }
}

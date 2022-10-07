package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Session {

    public static void main(String[] args) {
         
    List<List<Integer>> lines = new ArrayList<List<Integer>>();
    List<Integer> l1 = new ArrayList<>();
    l1.add(5);
    l1.add(6);
    l1.add(52);
    l1.add(15);
    l1.add(85);
    
    List<Integer> l2 = new ArrayList<>();
    l1.add(3);
    l1.add(5);
    l1.add(2);
    l1.add(15);
    l1.add(8);

    lines.add(l1);
    lines.add(l2);
    
    lines.forEach(item ->{
       for (Integer integer : item) {
        System.out.println(integer);
       }
    }); 
    }
}

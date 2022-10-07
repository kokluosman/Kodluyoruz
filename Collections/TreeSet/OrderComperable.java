package Collections.TreeSet;

import java.util.Comparator;

public class OrderComperable implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        return o1.getNote()-o2.getNote();
    }
    
}

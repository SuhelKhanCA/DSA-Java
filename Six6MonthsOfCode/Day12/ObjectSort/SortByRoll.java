package Six6MonthsOfCode.Day12.ObjectSort;

import java.util.Comparator;

public class SortByRoll implements Comparator<Student>{
    
    public int compare(Student a, Student b){
        return a.rollNo - b.rollNo;
    }

    // @Override
    // public int compare(Object o1, Object o2) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'compare'");
    // }
}

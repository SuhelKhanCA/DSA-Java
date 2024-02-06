package Six6MonthsOfCode.Day14;

import java.util.Vector;

public class VectorDemo2 { //  legacy method defined by class
  public static void main(String[] args) {
      // initial size is 3, increament is 2
      Vector v = new Vector(3, 2);
      System.out.println("Initial size: " + v.size());
      System.out.println("Initial capacity: " + v.capacity());

      v.addElement(new Double(5.45));
      System.out.println("Current capacity: " + v.capacity());
  }  
}

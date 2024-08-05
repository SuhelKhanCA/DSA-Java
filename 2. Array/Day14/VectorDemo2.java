package Six6MonthsOfCode.Day14;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 { //  legacy method defined by class:Vector
  public static void main(String[] args) {
      // initial size is 3, increament is 2
      Vector v = new Vector(3, 2);
      System.out.println("Initial size: " + v.size());
      System.out.println("Initial capacity: " + v.capacity());

      v.addElement(new Double(5.45));
      System.out.println("Current capacity: " + v.capacity());
      v.addElement(new Double(6.08));
      v.addElement(new Integer(7));
      System.out.println("Curent capacity : " + v.capacity());

      v.addElement(new Float(9.4));
      v.addElement(new Integer(10));
      System.out.println("Current capacity: "+ v.capacity());

      v.addElement(new Integer(11));
      v.addElement(new Integer(12));
    //   System.out.println("First element: "+ (Integer)v.firstElement());
      System.out.println("Last element: "+ (Integer)v.lastElement());

      if (v.contains(new Integer(3))) {
            System.out.println("Vector contains 3.");
      }

      // Enumerate thr elements in the Vector
      Enumeration vEnum = v.elements();
      System.out.println("\nElements in the Vector:");
      while (vEnum.hasMoreElements()) {
        System.out.print(vEnum.nextElement() + " ");
        System.out.println();
      }
  }  
}

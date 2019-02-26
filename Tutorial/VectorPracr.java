import java.util.*;
public class VectorPracr {
    public static void main(String[] args) {
        Vector v = new Vector(3,2);
        System.out.println("Initian size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        v.addElement(new Integer(7));
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));

        System.out.println("After edition: " + v.size() + "\nCapacity: " + v.capacity());

        v.addElement(new Double(5.45));
        System.out.println("Current capacity: " + v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity: " + v.capacity());

        v.addElement(new Integer(11));
        v.addElement(new Integer(12));

        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());

        if(v.contains(new Integer(3))){
            System.out.println("True<3>");
        }

        System.out.println("First element: " + (Integer)v.firstElement());
        System.out.println("Last element: " + (Integer)v.lastElement());

        Enumeration vEnum = v.elements();
        System.out.println("Elements in vector:\n ");
        System.out.println(vEnum);

        while (vEnum.hasMoreElements()){
            System.out.println(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}

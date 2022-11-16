package lab4;

import java.util.*;

class Lab4 {
    public static <T extends Comparable<T>> int smallest(List<T> l) {
        if (l.size() == 0) return -1;
        else {
            Iterator<T> it = l.iterator();
            T smallestSoFar = it.next();

            T temp;
            int smallestPos = 0;
            int i = 1; //used to indicate position in list of next item
            while (it.hasNext()) { // compare next item with smallest so far
                // if it's smaller update smallestSoFar and smallestPos
                temp = it.next();
                if (temp.compareTo(smallestSoFar) < 0) {
                    smallestSoFar = temp;
                    smallestPos = i;
                }
                i++;
            }
            return smallestPos;  // should not do this!
        }
    }

    public static <T extends Comparable<T>> void deleteSmallest(List<T> l) { // for exercise 2
        if (l.size() == 0) return;
        l.remove(smallest(l));
    }

    public static void main(String[] args) {
        Vector<String> vec1 = new Vector<String>();
        vec1.add("Hello");
        vec1.add("world");
        vec1.add("g");
        vec1.add("xxxx");
        vec1.add("aardvark");
        vec1.add("gg");
        int smallPos = smallest(vec1);
        if (smallPos != -1)
            System.out.println("smallest entry is " + vec1.elementAt(smallPos) + " at position " + smallPos);
        Vector<Integer> vec2 = new Vector<Integer>();
        vec2.add(new Integer(47));
        vec2.add(new Integer(17));
        vec2.add(new Integer(399));
        vec2.add(new Integer(247));
        smallPos = smallest(vec2);
        if (smallPos != -1)
            System.out.println("smallest entry is " + vec2.elementAt(smallPos) + " at position " + smallPos);

        Vector<Integer> vec3 = new Vector<>();
        vec3.add(1);
        vec3.add(2);
        vec3.add(3);

        smallPos = smallest(vec3);

        if (smallPos != -1) {
            System.out.println("smallest entry " + vec3.elementAt(smallPos) + " was deleted ");
            deleteSmallest(vec3);
            System.out.println(vec3);
        }
    }
}

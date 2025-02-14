import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Set;
import java.util.*;

public class Collections {
    public static void main(String[] args){
        Linkedlistthread t1=new Linkedlistthread();
        t1.run();
        Arraylistthread t2=new Arraylistthread();
        t2.run();
        Stackthread t3=new Stackthread();
        t3.run();
        Hashsetthread t4=new Hashsetthread();
        t4.run();

    }
}
class Linkedlistthread extends Thread{
    public void run(){
        LinkedList<Integer> list1 = new LinkedList<>();
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        //  System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: " + list1.size());
        //Adding one element
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());
//Checking for an element
        System.out.println("Is 566 available in the list:" + list1.contains(566));
        System.out.println("The given list before removing elements is :" + list1);

        list1.remove(2);//Removing element by its index
        list1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());
    }
}
class Arraylistthread extends Thread {
    public void run() {
            ArrayList<Integer> list1 = new ArrayList<>();
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            list1.add(50);
            list1.add(23);
            list1.add(67);
            list1.add(82);
            list1.add(56);
            list1.add(49);
            list1.add(49);
            list1.add(49);
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            //  System.out.println("The given list is:"+list1);
            System.out.println("Number of elements in the list: " + list1.size());
            //Adding one element
            list1.add(12);
            System.out.println("After adding one element:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the list: " + list1.size());
//Checking for an element
            System.out.println("Is 566 available in the list:" + list1.contains(566));
            System.out.println("The given list before removing elements is :" + list1);

            list1.remove(2);//Removing element by its index
            list1.remove(3);//Removing element by its index
            System.out.println("After removing elements:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the list: " + list1.size());
        }
    }
class Stackthread extends Thread{
    public void run() {
        Stack<Integer> list1 = new Stack<>();
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        list1.add(50);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        //  System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: " + list1.size());
        //Adding one element
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());
//Checking for an element
        System.out.println("Is 566 available in the list:" + list1.contains(566));
        System.out.println("The given list before removing elements is :" + list1);

        list1.remove(2);//Removing element by its index
        list1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());
    }
}
class Hashsetthread extends Thread{
    public void run(){

        Set<Integer> hs = new HashSet<>();
        hs.add(5);hs.add(7);hs.add(10);
        hs.add(8);hs.add(8);hs.add(0);
        hs.add(6);
        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
        System.out.print("Using iterator : ");
        Iterator<Integer> iterator = hs.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        System.out.print("Using enhanced for loop : ");
        for (Integer element : hs)
            System.out.print(element + " ");
        hs.remove(0);


    }
}

import java.util.*;

public class Cset {
    public static void setSample(HashSet<Integer> hss) {
        Set<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(7);
        hs.add(10);
        hs.add(8);
        hs.add(8);
        hs.add(0);
        hs.add(6);
        hs.add(21);
        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
        System.out.print("Using iterator : ");
        Iterator<Integer> iterator = hs.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        hs.remove(0);
        System.out.print("Using enhanced for loop : ");
        for (Integer element : hs) {
            if (element % 7 == 0) {
                System.out.print(element + " ");
            }
        }
    }

    public static void setSample(LinkedList<String> lss) {
        Set<String> ls = new LinkedHashSet<>();
        ls.add("asdf");
        ls.add("klj");
        ls.add("lkjhgf");
        ls.add("jkl");
        ls.add("jklo");
        ls.add("lkj");
        ls.add("hjklh");
        ls.add("hju");
        System.out.println("HashSet Size: " + ls.size());
        System.out.println("Elements in HashSet: " + ls);
        System.out.print("Using iterator : ");
        Iterator<String> iterator1 = ls.iterator();
        while (iterator1.hasNext())
            System.out.print(iterator1.next() + " ");
        System.out.println();
        ls.remove("asdf");
        System.out.print("Using enhanced for loop : ");
        for (String element : ls) {
            if (element.length() > 5) {
                System.out.print(element + " ");
            }
        }
    }

    public static void setSample(TreeSet<Double> tss) {
        Set<Double> ts = new TreeSet<>();
        ts.add(5.6);
        ts.add(7.6);
        ts.add(10.34);
        ts.add(80.5);
        ts.add(8.34);
        ts.add(0.4);
        ts.add(6.0);
        ts.add(21.9);
        System.out.println("HashSet Size: " + ts.size());
        System.out.println("Elements in HashSet: " + ts);
        System.out.print("Using iterator : ");
        Iterator<Double> iterator2 = ts.iterator();
        while (iterator2.hasNext())
            System.out.print(iterator2.next() + " ");
        System.out.println();
        ts.remove(0.4);
        System.out.print("Using enhanced for loop : ");
        for (Double element : ts) {
            if (element > 20) {
                System.out.print(element + " ");
            }
        }

    }

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        LinkedList<String> ls = new LinkedList<>();
        TreeSet<Double> ts = new TreeSet<>();
        setSample(hs);
        setSample(ls);
        setSample(ts);
    }

}
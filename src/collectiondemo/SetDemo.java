package collectiondemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();
        Set<Character> charSet=new TreeSet<>();

        charSet.add('M');
        charSet.add('A');
        charSet.add('D');
        charSet.add('A');
        charSet.add('M');

        Set<String> stringSet=new TreeSet<>();
        stringSet.add("prajakta");
        stringSet.add("snehal");
        stringSet.add("rajashri");
        stringSet.add("sakhshi");
        stringSet.add("Krati");
        stringSet.add("palak");

        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(7);
        hashSet.add(7);
        hashSet.add(7);
        hashSet.add(6);
        hashSet.add(6);
        hashSet.add(6);

        treeSet.addAll(hashSet);
        if (!stringSet.contains("snehal")) {
            for (String i : stringSet) {
                System.out.println(i);
            }
        }
        for (Character ch:charSet){
            System.out.println(ch);
        }

    }
}

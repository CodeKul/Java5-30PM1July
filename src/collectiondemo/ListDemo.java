package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> integerList=new ArrayList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);

        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3,10);
        list.addAll(integerList);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        if (!list.contains(1)) {
            for (int i : list) {
                System.out.println(i);
            }
        }
    }

}

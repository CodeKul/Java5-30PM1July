package keywords;

import java.util.Scanner;

public class StaticKey {

    private static int count = 0;
    private static int size = 0;

    private int getCount() {
        System.out.println(size);
        return ++count;
    }

    public static void getData() {
        //System.out.println(count);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
    }

    static {
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            StaticKey staticKey = new StaticKey();
            System.out.println(staticKey.getCount());
        }
        getData();
    }

}

package polymorphism;

public class MethodOverloading {

    static int add(int a,int b)
    {
        return (a+b);
    }

    private static int[] emp()
    {
        int[] arr={1,6,9,8,7};
        return arr;
    }

    static void add(){

    }

    public static void main(String[] args) {
      /*  System.out.println(add(1,2));

        for (int i=0;i<emp().length;i++){
            System.out.println(emp()[i]);
        }*/

        for (int j:emp()) {
            System.out.println(j);
        }
        }
}

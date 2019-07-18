package polymorphism;

public class MethodOverloading {

    static void add(int a,int b)
    {
        System.out.println("addition : "+(a+b));
    }

    private static int[] emp()
    {
        int[] arr={1,6,9,8,7};
        return arr;
    }

    static void add(float a,float b){
        System.out.println("addition : "+(a+b));
    }

    public static void main(String[] args) {
      /*  System.out.println(add(1,2));

        for (int i=0;i<emp().length;i++){
            System.out.println(emp()[i]);
        }*/
        add(1.1F,2.2F);

       /* for (int j:emp()) {
            System.out.println(j);
        }*/
        }
}

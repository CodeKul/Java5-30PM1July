package inheritancedemo;

public class MultilevelInheritance extends SingleInheritance {

    int mul(int a,int b){
        return a*b;
    }
   /* int add(int a,int b){
        return a+b+10;
    }*/

    public static void main(String[] args) {
        MultilevelInheritance multilevelInheritance=new MultilevelInheritance();
        System.out.println(multilevelInheritance.add(10,20));
    }

}

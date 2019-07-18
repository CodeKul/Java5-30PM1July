package inheritancedemo;

public class SingleInheritance extends CheckInheritance {

    public SingleInheritance() {
        super();
        System.out.println("inside single inheritance");
    }

    int sub(int a, int b){
        super.add(a,b);
        return a-b;
    }

    int add(int a, int b){
        return a+b;
    }


    public static void main(String[] args) {
        SingleInheritance singleInheritance=new SingleInheritance();
        System.out.println("add : "+singleInheritance.add(10,20));
        System.out.println("sub : "+singleInheritance.sub(30,20));
    }

}

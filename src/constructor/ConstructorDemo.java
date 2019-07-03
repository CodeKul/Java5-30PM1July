package constructor;

import keywords.ThisKey;

public class ConstructorDemo {

    int a;
    int b;
    ThisKey thisKey;
    public ConstructorDemo(float a, float b, ThisKey thisKey){
        System.out.println("a : "+a+"b :  "+b);
    }
    ConstructorDemo(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("a : "+a+"b :  "+b);
    }
    int add(){
        return (a+b);
    }
    void sub(){
        add();
    }
    public static void main(String[] args) {
        ConstructorDemo demo=new ConstructorDemo(10,20);
        System.out.println(demo.add());
    }

}

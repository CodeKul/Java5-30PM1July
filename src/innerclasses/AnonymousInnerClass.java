package innerclasses;

import abstractionandinterface.InterfaceDemo;

public class AnonymousInnerClass {

    public static void main(String[] args) {

        InterfaceDemo demo=new InterfaceDemo() {
            @Override
            public void showData() {
                System.out.println("Anonymous Inner Class");
            }
        };

        demo.showData();


    }

}

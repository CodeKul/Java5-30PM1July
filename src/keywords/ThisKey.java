package keywords;

import constructor.ConstructorDemo;

public class ThisKey {

    String name;//1} initialised instance variable

    ThisKey(String name){
        this.name=name;
    }

    void showData(){
        ConstructorDemo demo=new ConstructorDemo(1.1F,2.2F,this);
        System.out.println("Name : "+name);
    }

    public static void main(String[] args) {
        new ThisKey("codekul").showData();

    }

}

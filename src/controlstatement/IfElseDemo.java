package controlstatement;

import java.util.Scanner;

public class IfElseDemo {

    public void ifElseDemo(int number){

        if (number<35){
            System.out.println("fail");
        }
        else if(number>=35 && number<60){
            System.out.println("pass class");
        }
        else if(number>=60&& number<75){
            System.out.println("first class");
        }
        else if(number>=75 && number<=100){
            System.out.println("dist");
        }
        else {
            System.out.println("Invalid");
        }

    }

    public static void main(String[] args) {
        IfElseDemo demo=new IfElseDemo();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        demo.ifElseDemo(scanner.nextInt());
    }

}

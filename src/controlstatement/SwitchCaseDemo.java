package controlstatement;

import java.util.Scanner;

public class SwitchCaseDemo {

    void checkSwitch(int a, int b, int choice) {

        switch (choice) {

            case 1:
                System.out.println("add is : " + (a + b));
                break;
            case 2:
                System.out.println("sub is : " + (a - b));
                break;
            case 3:
                System.out.println("mul is : " + (a * b));
                break;
            case 4:
                System.out.println("div is : " + (a / b));
                break;

            default:
                System.out.println("Invalid");

        }

    }
    /*  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SwitchCaseDemo demo = new SwitchCaseDemo();

        System.out.println(" 1) +\n" + " 2) -\n" +
                " 3) *\n" + " 4) /\n");
        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();
        System.out.print("enter the values of a and b  : ");
        demo.checkSwitch(scanner.nextInt(), scanner.nextInt(), choice);

    }
}

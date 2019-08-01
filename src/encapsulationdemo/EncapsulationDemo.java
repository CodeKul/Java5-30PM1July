package encapsulationdemo;

import java.util.Scanner;

public class EncapsulationDemo {
    Registration registration=new Registration();

    private void saveRegistrationForm(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Name : ");
        registration.setName(scanner.nextLine());
        System.out.print("Contact No : ");
        registration.setContactNumber(scanner.nextLine());
        System.out.print("UserName : ");
        registration.setUserName(scanner.nextLine());
        System.out.print("Password : ");
        registration.setPassword(scanner.nextLine());
        displayData();
    }

    private void displayData(){
        System.out.println(
                registration.getName()+"\n"+
                registration.getContactNumber()+"\n"+
                registration.getUserName()+"\n"+
                registration.getPassword());
    }

    public static void main(String[] args) {
        EncapsulationDemo demo=new EncapsulationDemo();
        demo.saveRegistrationForm();
    }

}

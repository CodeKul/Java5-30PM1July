package innerclasses;

public class MethodInnerClass {
    private String password="HasMatGagan";

    void display(){

        class CheckMethodInnerClass{

            public String getPassword(){
                return password;
            }

        }

        CheckMethodInnerClass checkMethodInnerClass=new CheckMethodInnerClass();
        System.out.println("password : "+checkMethodInnerClass.getPassword());
    }

    public static void main(String[] args) {
        new MethodInnerClass().display();
    }

}

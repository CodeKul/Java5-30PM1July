package exceptionhandling;

public class ExceptionHandlingDemo {

    private static int checkArithmeticException(){
        int result=0;
        try {
           int a=10;
           result=a/0;
           System.out.println("result : "+result);
       }
       catch (Exception a){
           System.out.println(a);
       }


        return result;
    }

    private void checkNullPointerException(){
        String name=null;
        try {
            System.out.println(name.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }

    private static String getRestOfCode(){
        return "Rest of code";
    }

    public static void main(String[] args) {
        ExceptionHandlingDemo demo=new ExceptionHandlingDemo();
        demo.checkNullPointerException();
        //checkArithmeticException();
        System.out.println(getRestOfCode());
    }

}

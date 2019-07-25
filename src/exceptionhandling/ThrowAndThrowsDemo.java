package exceptionhandling;

import java.io.IOException;

public class ThrowAndThrowsDemo {


    private void checkThrow() throws IOException{
        throw new IOException("exception handle");
    }

    public static void main(String[] args) {
        ThrowAndThrowsDemo demo=new ThrowAndThrowsDemo();
        try {
            demo.checkThrow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

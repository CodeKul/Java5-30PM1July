package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {

    private static void getFileData() throws IOException {
        FileInputStream inputStream=new FileInputStream("/home/melayer-01/Documents/filehandling/demo.txt");
        int i=0;
        while((i=inputStream.read())!= -1) {
            System.out.print((char) i);
        }

        inputStream.close();
    }

    private void saveFileData() throws IOException {
        FileOutputStream outputStream=new FileOutputStream("/home/melayer-01/Documents/filehandling/demo.txt");
        String name="codekul";
        byte[] bytes=name.getBytes();
        outputStream.write(bytes);
        outputStream.close();
        System.out.println("successfully saved");
    }

    public static void main(String[] args) throws IOException {
        getFileData();
    }

}

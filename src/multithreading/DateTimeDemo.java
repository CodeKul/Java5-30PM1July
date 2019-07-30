package multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo {

    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd hh-mm-sss");
        Date date=new Date();
        String newDate=simpleDateFormat.format(date);
        System.out.println(newDate);

        System.out.println(
                new SimpleDateFormat("dd-MM-yyyy")
                        .format(System.currentTimeMillis())
        );

    }
}

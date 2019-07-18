package stringdemo;

public class CheckString {


    void getString() {

        for (int i = 0; i < 100000; i++) {
            String s = "codekul";
            s = s.concat("Institute");
        }

    }

    void getStringBuffer() {
        for (int i = 0; i < 100000; i++) {
            StringBuilder stringBuffer = new StringBuilder("codekul");
            stringBuffer.append("Institute");
        }
    }

    void getStringBuilder() {
        for (int i = 0; i < 100000; i++) {
            StringBuilder stringBuilder = new StringBuilder("codekul");
            stringBuilder.append("Institute");
        }
    }

    public static void main(String[] args) {

        CheckString checkString = new CheckString();
        long currentTimeOfString = System.currentTimeMillis();
        checkString.getString();
        System.out.println("execution time for string : " + (System.currentTimeMillis() - currentTimeOfString));

        long currentTimeOfStringBuffer = System.currentTimeMillis();
        checkString.getStringBuffer();
        System.out.println("execution time for string buffer: " + (System.currentTimeMillis() - currentTimeOfStringBuffer));


        long currentTimeOfStringBuilder = System.currentTimeMillis();
        checkString.getStringBuilder();
        System.out.println("execution time for string builder: " + (System.currentTimeMillis() - currentTimeOfStringBuilder));


    }

}

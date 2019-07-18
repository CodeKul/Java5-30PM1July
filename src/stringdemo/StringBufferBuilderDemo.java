package stringdemo;

public class StringBufferBuilderDemo {

   static private StringBuffer saveStringBuffer(){
        StringBuffer buffer=new StringBuffer("codekul");
        buffer.append(" institute");
        System.out.println(buffer);

        return buffer;
    }

    static private StringBuilder saveStringBuilder(){
        StringBuilder builder=new StringBuilder("codekul");
        builder.append(" institute");
        System.out.println(builder.reverse());

        return builder;
    }

    public static void main(String[] args) {

        saveStringBuilder();
    }

}

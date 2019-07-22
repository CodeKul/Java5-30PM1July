package recursivefunction;

public class RecurtionDemo {

   static String s="codekul";
    static int stringSize=0;
    static char[] array;


    private static void reverseFunction(char[] array,int newSize){
        stringSize=newSize;
        System.out.print(array[stringSize]);
        if (stringSize>0){
            stringSize--;
            reverseFunction(array,stringSize);
        }

    }

    public static void main(String[] args) {
        array=s.toCharArray();
        reverseFunction(array,array.length-1);
    }


}




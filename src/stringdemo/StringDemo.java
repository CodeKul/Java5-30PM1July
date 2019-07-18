package stringdemo;

public class StringDemo {
    static String s3="institute";

    public static void main(String[] args) {

        String s="codekul";
        char[] str=s.toCharArray();
        for (int i=str.length-1;i>=0;i--){
            System.out.print(str[i]);
        }
        System.out.println();
        String s2="Codekul";

        String s1=new String("Codekul");

      //  s=s.concat("class");
      /*  System.out.println("s : "+s.hashCode());
        System.out.println("s2 : "+s2.hashCode());
        System.out.println("s1 : "+s1.hashCode());*/

        System.out.println(s.charAt(3));

      /*  if (s3 == null){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }*/
    }
}

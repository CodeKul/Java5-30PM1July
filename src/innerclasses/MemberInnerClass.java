package innerclasses;

public class MemberInnerClass {

    private String password="ROMATPALAK";

    class CheckMemberInnerClass{

        public String getPassword(){
           return password;
        }

    }

    public static void main(String[] args) {

        MemberInnerClass innerClass=new MemberInnerClass();
        MemberInnerClass.CheckMemberInnerClass checkMemberInnerClass=innerClass.new CheckMemberInnerClass();
        System.out.println("password : "+checkMemberInnerClass.getPassword());
    }


}

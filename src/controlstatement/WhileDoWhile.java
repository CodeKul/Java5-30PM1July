package controlstatement;

public class WhileDoWhile {

    public static void main(String[] args) {

        int i=0;
        while (i<5){
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        }while (i<5);

    }

}

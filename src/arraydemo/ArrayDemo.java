package arraydemo;

import java.util.Scanner;

public class ArrayDemo {

    void get1DArray() {

        int[] array =new int[10];
        int[] array1 = new int[10];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            System.out.println("Enter the array of "+i+" : ");
            array[i]=scanner.nextInt();
        }

        for (int i:array){
            System.out.println(i);
        }
    }

    void get2DArray(){
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};

        for (int i=2;i>=0;i--){
            for (int j=2;j>=0;j--){

                    System.out.print(" " + array[i][j]);
                }
            System.out.println();
        }


    }

    void getUneryOperators() {

        int a = 10;
        int b = ++a;//b=11 a=11
        int c = (b++) + (++a);//c=23 b=12 a=12
        int d = (++c) + (b++) + (++a);//d=49 c=24,b=13,a=13
        int e = (c--) + (--b) + (d++) - (--a);//e=73 d=50 c=23,12,12

        //arnav=10,11,22,45,48
        //samruddhi=12,12,23,50,63
        //gagan=22,47,40
        //kirti=10,11,22,45,68
        //krati=12,11,23,48,76

        System.out.println("a" + a);
        System.out.println("b" + b);
        System.out.println("c" + c);
        System.out.println("d" + d);
        System.out.println("e" + e);
    }

    public static void main(String[] args) {
        ArrayDemo demo = new ArrayDemo();
        demo.get2DArray();
    }

}

/*1 2 3
4 5 6
7 8 9*/

/*
9 8 7
6 5 4
3 2 1

7 8 9
4 5 6
1 2 3
*/

/*00 01 02
10 11 12
20 21 22*/

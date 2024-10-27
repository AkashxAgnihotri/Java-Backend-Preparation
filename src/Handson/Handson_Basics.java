package Handson;

public class Handson_Basics {
    public static void main(String[] args) {
//        int N = 7;
//
//        // looping from 1 to 10 to print the multiplication
//        // table of the number.
//        // using for loop
//        for (int i = 1; i <= 10; i++) {
//            // printing the N*i,ie ith multiple of N.
//            System.out.println(N + " * " + i + " = "
//                    + N * i);
//        }
//        int num =8;
//        for(int i= 1; i<=10;i++){
//            System.out.println(num+"x"+i+"="+num*i);
//        }
table(6);
    }
    static void table(int no){
        for (int i = 1; i<=10; i++)
        {
            System.out.println(i*no);
        }
    }
}


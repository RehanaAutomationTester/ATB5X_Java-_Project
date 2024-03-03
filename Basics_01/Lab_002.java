package Basics_01;

public class Lab_002 {
    public static void main(String[] args) {
        //Write your code here
        /* Logical Operators "OR Operator"
           False ||  False =  False
           False || True   =  True
           True || False  =  True
           True || True   =  True
         */
        /* Logical Operators "AND Operator"
           False &  False =  False
           False & True   =  True
           True & False  =  True
           True & True   =  True
         */
    /*
     Plaese Go through the JavaPracticeRepo.Z_my_Practice file to
     see the diff problem statements
     */

        boolean a= true;
        boolean b= false;
        boolean e= true;
        Boolean c;
        Boolean d;
        Boolean d1;
        c= a & b;
        d= b & c;
        d1= e & a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(d1);

    }
}
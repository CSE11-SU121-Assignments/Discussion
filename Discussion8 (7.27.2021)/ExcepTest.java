import java.io.*;
import java.util.Arrays;

public class ExcepTest{
    public static boolean baz(){
        
        int a[]= new int[2];
        System.out.println("Access element three"+ a[3]);
        return true;
    }

    public static boolean bar(){
        return baz();
    }

    public static boolean foo(){
        return bar();
    }

    public static void main(String args[]){
        System.out.println("" + foo());
        
        /*
        try{
            
        }
        catch(Exception e){
            System.out.println("Exception thrown : "+e);
        }
        


    

        //int x = -2147483648 -1; // wrapping behavior 

        //System.out.println("x is: " + x);


        // Float largestShort = Float.MIN_VALUE;
        // System.out.println("smallest float:" + largestShort);

        String[] arrOne = {"a","b","c"};
        String[] arrTwo = {"a", "b", "c"};
        boolean eqTryOne = arrOne.equals(arrTwo);
        boolean eqTryTwo = Arrays.equals(arrOne, arrTwo);

        // System.out.println("string array 1 .equals" + eqTryOne);
        // System.out.println("Arrays.equals()" + eqTryTwo);

        String toStringTryOne = arrOne.toString();
        String toStringTryTwo = Arrays.toString(arrOne);

        // System.out.println(toStringTryOne);
        // System.out.println(toStringTryTwo);    

        String a = "hello";
        String b = "hhello".substring(1);

        boolean c = a==b ;//false

        boolean d = a.equals(b); //true
        System.out.println("a: "+ a);
        System.out.println("b" + b);
        System.out.println(c);
        System.out.println(d);

        */

    }

}
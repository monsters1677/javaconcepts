package fundementals.src.javaPrograms.StringOperations;

import java.nio.charset.Charset;

public class AllStringEx {
    public static void main(String[] args){
        /*byte[] s= {71, 101, 101, 107, 115};
        Charset s1 = Charset.defaultCharset();
        char[] s2= {'G', 'e', 'e', 'k', 's'};
        int[] s3= {71, 101, 101, 107, 115};*/
        String s1= "SHARATH";
        String  s2= "KRISH";

        System.out.println(s1.substring(2,5));
        System.out.println(s1.substring(5));
        System.out.println(s2.equals(s1));
        System.out.println(s2.length());
        System.out.println(s2.charAt(4));
        System.out.println(s2.concat(s1));
        System.out.println(s2.indexOf(2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.repeat(5));
        System.out.println(s2.getBytes());

        //System

        //String SS3=new String(s,Charset.forNam ());


    }
}

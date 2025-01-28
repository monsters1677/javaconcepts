package fundementals.src.javaPrograms.Operators;

import java.util.Locale;

public class LogicalOPS {
    public static void main(String[] args){
        int a=5;
        int b=4;
        if(a<=5 && b<6){
            System.out.println(a+" "+b);
        }
        String lastName= "Dasaratha";
        String firstName= "Polakattu";
        System.out.println(lastName.charAt(7));
        System.out.println(lastName.toUpperCase());
        //System.out.println(lastName.);


        String rev="";
        char c;
        for(int i=0;i<lastName.length();i++){
            c=lastName.charAt(i);
            rev=c+rev;
        }
        System.out.println(rev);
        System.out.println(rev.toUpperCase());
        //System.out.println(""+firstName+" "+lastName);
        //System.out.println(firstName.);
        String s=firstName.concat( " "+lastName);
        System.out.println(s);



    }
}

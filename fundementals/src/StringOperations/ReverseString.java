package StringOperations;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any string :");
        String ms=s.nextLine();
        char[] c=ms.toCharArray();
        StringBuilder rs= new StringBuilder();
        for (int g=1;g<c.length+1;g++){
            rs.append(c[c.length-g]);
        }
        System.out.println(rs);
    }
}

package IOStreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BR2 {
    public static void main(String[] args) {
        try(
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                ) {
            System.out.print("Enter first value  :");
            String first=br.readLine();
            System.out.print("Enter second value :");
            String second=br.readLine();
            System.out.println("Concat :"+first+second);
            int num1=Integer.parseInt(first);
            int num2=Integer.parseInt(second);
            System.out.println("Add "+(num1+num2));
            System.out.println("sub "+(num1-num2));
            System.out.println("mul "+num1*num2);
            System.out.println("div "+num1/num2);
            System.out.println("modulo "+num1%num2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

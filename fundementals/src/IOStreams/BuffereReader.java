package IOStreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffereReader {
    public static void main(String[] args){
        try(
                BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                ){
            System.out.print("Enter the String :");
            String firOne=b.readLine();
            System.out.print("Enter the same data again :");
            int n=b.read();

            System.out.println("the first value is :"+firOne);
            System.out.println("Second value is    :"+n+"["+(char)n+"]");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

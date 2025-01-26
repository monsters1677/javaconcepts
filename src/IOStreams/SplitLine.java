package IOStreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SplitLine {
    public static void main(String[] args){
        try (
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                ){
            System.out.print("Enter the numbers with separator space :");
            String s=br.readLine();
            String[] numbers=s.split(" ");
            int sum=0;
            for (String num: numbers){
                int digit=Integer.parseInt(num);
                sum+=digit;
            }
            System.out.println("sum of all the numbers :"+sum);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

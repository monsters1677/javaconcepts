package fundementals.src.javaPrograms.ioOperations;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicBR1 {
    public static void main(String[] args){
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ){
            System.out.print("Enter Data     : ");
            String data = br.readLine();
            System.out.print("Enter the same data again      : ");
            int val = br.read();
            System.out.println("readLine()  : " + data);
            System.out.println("read()      : " + val+"["+(char)val+"]");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

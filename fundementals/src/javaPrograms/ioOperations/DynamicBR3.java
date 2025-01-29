package fundementals.src.javaPrograms.ioOperations;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicBR3 {
    public static void main(String[] args){
        try (
                BufferedReader V=new BufferedReader(new InputStreamReader(System.in))
        ){
            System.out.println("Enter movie name     :");
            String G=V.readLine();
            System.out.println("Enter same movie name:");
            int u=V.read();
            System.out.println("readline()           :"+G);
            System.out.println("read()               :"+u+"["+(char)u+"]");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

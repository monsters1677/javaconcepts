package fundementals.src.javaPrograms.ioOperations;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicBR2 {
    public static void main(String[] args){
        try(
                BufferedReader BR = new BufferedReader(new InputStreamReader(System.in))
        ){
            System.out.println("Enter the Data:");
            String S=BR.readLine();
            System.out.println("Same Data:");
            int i=BR.read();
            System.out.println("readline():"+S);
            System.out.println("read() :" +i+"["+(char)i+"]");
            }catch (Exception e){
            e.printStackTrace();
        }
    }
}

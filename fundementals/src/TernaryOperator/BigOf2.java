package TernaryOperator;

//import //javafx.scene.transform.Scale;

import java.util.Scanner;

public class BigOf2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first value  :");
        int firVal=s.nextInt();
        System.out.print("Enter the second value :");
        int secVal=s.nextInt();
        System.out.print("Enter the third value :");
        int thirdVal=s.nextInt();
        int big=((firVal>=secVal)&&(firVal>=thirdVal)?((secVal>=firVal&&secVal>=thirdVal)?secVal:firVal):thirdVal);
        System.out.println("biggest number is :"+big);
    }
}

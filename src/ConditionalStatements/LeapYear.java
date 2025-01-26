package ConditionalStatements;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the year you want");
        int num=obj.nextInt();
        if(num%4==0){
            System.out.println(num+" is a leap year");
        }else {
            System.out.println(num+" is not a leap year");
        }
    }
}

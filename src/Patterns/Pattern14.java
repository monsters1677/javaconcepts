package Patterns;
import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the no of rows you want");
        int num= o.nextInt();
        for (int i = 0; i <num; i++) {
            for (int spaces=0;spaces<num-i;spaces++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

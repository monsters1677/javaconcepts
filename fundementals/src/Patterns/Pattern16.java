package Patterns;
import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter no of rows you want");
        int num= o.nextInt();
        for (int i = 1; i <num+1; i++) {
            for (int g=0;g<num-i;g++){
                System.out.print(" ");
            }
            for (int stars=0; stars<i*2;stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

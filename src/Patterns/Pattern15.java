package Patterns;
import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter no of rows you want");
        int num= o.nextInt();
        for (int i = 1; i <num+1; i++) {
            for (int g=1;g<num-i+1;g++){
                System.out.print(" ");
            }
            for (int k=0;k<2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

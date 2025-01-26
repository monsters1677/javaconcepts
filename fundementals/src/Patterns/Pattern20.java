package Patterns;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter no of rows you want");
        int num= o.nextInt();
        for (int i = 0; i <num; i++) {
            for (int g=0;g<(num-i)-1;g++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<num-1;i++){
            for (int spaces=0;spaces<=i;spaces++){
                System.out.print(" ");
            }
            for (int stars=0;stars<(num-1)-i;stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter no of rows you want");
        int num= o.nextInt();
        for (int i = 0; i <num; i++) {
            for (int g=0;g<i;g++){
                System.out.print(" ");
            }
            for (int k=0;k<(num*2)-i*2;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

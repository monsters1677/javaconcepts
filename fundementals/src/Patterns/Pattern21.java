package Patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        System.out.println("Enter no of rows you want");
        int num;
        num=n.nextInt();
        for (int rows=0;rows<num;rows++){
            for (int spaces=0;spaces<rows;spaces++){
                System.out.print(" ");
            }
            for (int stars=0;stars<num-rows;stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int rows=1;rows<num;rows++){
            for (int spaces=0;spaces<num-(rows+1);spaces++){
                System.out.print(" ");
            }
            for (int stars=0;stars<rows+1;stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

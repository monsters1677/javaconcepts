package Patterns;

import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args){
        Scanner h=new Scanner(System.in);
        System.out.println("Enter no of rows you want from 5");
        int num=h.nextInt();
        for (int rows=0;rows<num;rows++){
            for (int spaces=0;spaces<num-rows;spaces++){
                System.out.print(" ");
            }
            for (int stars=0;stars<=rows;stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int rows=0;rows<num;rows++){
            for (int spaces=0;spaces<(num/2)+1;spaces++){
                System.out.print(" ");
            }
            for (int stars=0;stars<(num/2)+1;stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

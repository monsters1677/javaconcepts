package Patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args){
        int num=10;
        for (int rows=0;rows<num/2;rows++){
            for (int stars=0;stars<num;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int rows=1;rows<num/2;rows++){
            for (int spaces=0;spaces<(num/5)+1;spaces++){
                System.out.print(" ");
            }
            for (int stars=0;stars<(num/5)+2;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            for (int spaces=0;spaces<9-i;spaces++){
                System.out.print("  ");
            }
            for (int k=0;k<=i;k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

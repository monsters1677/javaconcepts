package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            for (int spaces=0;spaces<i;spaces++){
                System.out.print("  ");
            }
            for (int k=0;k<9-i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

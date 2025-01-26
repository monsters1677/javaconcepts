package Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            for (int k=0;k<10;k++) {
                System.out.print((char) (74-i)+" ");
            }
            System.out.println();
        }
    }
}

package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int g = 0; g < 10; g++) {
                System.out.print((char)(65+g)+" ");
            }
            System.out.println();
        }
    }
}

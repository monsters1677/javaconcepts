package Patterns;
public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            for (int k=9;k>=0;k--) {
                System.out.print((char) (65+k)+" ");
            }
            System.out.println();
        }
    }
}

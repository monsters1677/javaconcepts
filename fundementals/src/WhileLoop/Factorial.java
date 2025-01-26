package WhileLoop;

public class Factorial {
    public static void main(String[] args){
        int k=6;
        int h=1;
        int fact=1;
        while(h<=k){
            fact=fact*h;
            h+=1;
        }
        System.out.println("factorial of ("+k+") is"+fact);
    }

}

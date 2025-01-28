package fundementals.src.javaPrograms.Operators;

public class AssignmentOPT {
    public static void main(String[] args){
        short t=60;
        int i=5;
        System.out.println("ASSIGNMENT OPERATORS");
        System.out.println("---------------------");
        System.out.println();
        System.out.println(i+=(i*5));//
        System.out.println(i-=(t/2));//
        System.out.println(i*=(i-(t*2)));//
        System.out.println(i/=(t/2));//
        System.out.println(t+=(t+=2));//
        System.out.println(t-=(t*5));//
        System.out.println(t*=(t+=5));//
        System.out.println(t+=(i-=10));//
        System.out.println(t%=(i*=(t*=2)));//
    }
}

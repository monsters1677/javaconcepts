package fundementals.src.javaPrograms.Statements;

public class whileloop3 {
    public static void main(String[] args){
        int fact=1;
        int i=1;
        while (i<=5){
            fact=fact*i;
            i+=1;
        }
        System.out.println("factorial of 5 is:"+fact);
    }
}

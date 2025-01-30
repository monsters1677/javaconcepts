package fundementals.src.javaPrograms.Statements;

public class whileloop2 {
    public static void main(String[] args){
        int u=500;
        while (u<900){
            if(u%7==0){
                System.out.println(u+" is divisible by 7 the remainder is "+u%7+" AND Division ="+u/7);
            }
            u++;
        }
    }
}

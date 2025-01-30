package fundementals.src.javaPrograms.Statements;

public class whileloop {
    public static void main(String[] args){
        int i=2;
        while (i<=100){
            System.out.println(i);
            if(i==64){
                break;
            }
            i*=2;
        }
        System.out.println("number of values print in :"+i);
    }
}

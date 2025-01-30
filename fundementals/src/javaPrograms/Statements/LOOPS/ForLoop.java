package fundementals.src.javaPrograms.Statements.LOOPS;

public class ForLoop {
    public static void main(String[] args){
        for(int i=0;i<=100;) {
            if(i==0){
                i+=5;
                continue;
            }else {
                System.out.println(i);
                i += 5;
            }
        }
    }
}

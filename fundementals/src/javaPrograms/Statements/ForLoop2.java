package fundementals.src.javaPrograms.Statements;

public class ForLoop2 {
    public static void main(String[] args){
        int factorial=1;
        for(int h=1;h<20;h++){
            System.out.println(h+"*"+factorial+"="+(factorial=factorial*h));
        }
        System.out.println("facorial of all numbers is :"+factorial);
    }
}

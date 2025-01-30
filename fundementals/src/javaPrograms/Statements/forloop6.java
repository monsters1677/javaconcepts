package fundementals.src.javaPrograms.Statements;

public class forloop6 {
    public static void main(String[] args){
        int i=150;
        for(;i<=200;i++){
            if(i%7==0){//150-7
                System.out.println(i+" is divisible by 7 the remainder  is "+i%7+" AND Division ="+i/7);
            }
        }
        System.out.println("loop executed for "+i+"times");
    }
}


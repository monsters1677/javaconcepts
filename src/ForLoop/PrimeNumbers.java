package ForLoop;

import java.util.logging.SocketHandler;

public class PrimeNumbers {
    public static void main(String[] args){
        for (int j=2;j<=100;j++){
            int count=0;
            for (int h=1;h<=j;h++){
                if(j%h==0){
                    count+=1;
                }
            }
            if(count==2){
                System.out.println(j+" is a prime");
            }else{
                System.out.println(j+" is not a prime");
            }
        }
    }
}

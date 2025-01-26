package ForLoop;

public class Prime {
    public static void main(String[] args){
        int j=7;
        int count=0;
        for (int i=1;i<=j;i++){
            if(j%i==0) {
                count =count+1;
            }
        }
        if(count==2){
            System.out.println(j+" is a Prime number");
        }else{
            System.out.println(j+" is not a Prime number");
        }
    }
}

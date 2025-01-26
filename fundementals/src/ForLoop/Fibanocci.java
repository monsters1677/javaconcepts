package ForLoop;

public class Fibanocci {
    public static void main(String[] args){
        int f=0;
        int s=1;
        System.out.print(f+" "+s+" ");
        for(int res=f+s;res<100;f=s,s=res,res=f+s)
            System.out.print(res+" ");
    }
}

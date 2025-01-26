package TransferStatements;

public class Break {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            for (int h=0;h<10;h++) {
                System.out.println(i+" "+h);
                if(h==5){
                    break;
                }
            }
        }
    }
}

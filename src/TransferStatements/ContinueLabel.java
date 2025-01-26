package TransferStatements;

public class ContinueLabel {
    public static void main(String[] args){
        k:for (int g=0;g<7;g++){
            for (int u=0;u<7;u++){
                System.out.println(g+" "+u);
                if(g==4){
                    continue k;
                }
            }
        }
    }
}

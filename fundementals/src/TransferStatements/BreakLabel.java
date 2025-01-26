package TransferStatements;

public class BreakLabel {
    public static void main(String[] args){
        l:for (int h=0; h<9;h++){
            for (int u=0;u<9;u++){
                System.out.println(h+" "+u);
                if (h==8){
                    break l;
                }
            }
        }
    }
}

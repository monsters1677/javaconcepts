package fundementals.src.javaPrograms.ioOperations;

import java.io.FileReader;

public class Filereaderr {
    public static void main(String[] args){
        try(
                FileReader fr = new FileReader("C:\\mywork\\docs\\docs\\fios4.txt");
        ){
            int i = fr.read();
            String S = "what is that?";
            while(i != -1){
                S =S + (char)i;
                i= fr.read();
            }
            System.out.println(S);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

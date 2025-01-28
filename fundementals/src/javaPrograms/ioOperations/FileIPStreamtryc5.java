package fundementals.src.javaPrograms.ioOperations;

import java.io.FileInputStream;

public class FileIPStreamtryc5 {
    public static void main(String[] args){
        FileInputStream y=null;
        try {
            y=new FileInputStream("C:\\mywork\\docs\\fios5.txt");
            int i=y.available();
            byte[] u=new byte[i];
            y.read(u);
            String g=new String(u);
            System.out.println(g);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

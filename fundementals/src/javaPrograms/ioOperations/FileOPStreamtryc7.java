package fundementals.src.javaPrograms.ioOperations;

import java.io.FileOutputStream;

public class FileOPStreamtryc7 {
    public static void main(String[] args){
        FileOutputStream k=null;
        try {
            k=new FileOutputStream("C:\\mywork\\docs\\fios5.txt",true);
            String s=("\nMY NAME IS SHARATH");
            byte[] b=s.getBytes();
            k.write(b);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                k.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

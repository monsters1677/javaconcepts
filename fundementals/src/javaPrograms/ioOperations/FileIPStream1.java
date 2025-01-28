package fundementals.src.javaPrograms.ioOperations;

import java.io.FileInputStream;

public class FileIPStream1 {
    public static void main(String[] args)throws Exception{
        FileInputStream H=new FileInputStream("C:\\mywork\\docs\\fios4.txt");
        int i=H.available();
        byte[] B=new byte[i];
        H.read(B);
        String S=new String(B);
        System.out.println(S);
        H.close();
    }
}

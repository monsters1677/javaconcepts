package fundementals.src.javaPrograms.ioOperations;

import java.io.FileInputStream;

public class FileIPStream2 {
    public static void main(String[] args)throws Exception{
        FileInputStream F=new FileInputStream("C:\\mywork\\docs\\fos2.txt");
        int d=F.available();
        byte[] g=new byte[d];
        F.read(g);
        String j=new String(g);
        System.out.println(j);
        F.close();
    }
}

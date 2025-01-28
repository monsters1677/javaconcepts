package fundementals.src.javaPrograms.ioOperations;

import java.io.FileOutputStream;

public class FileOPStream4 {
    public static void main(String[] args)throws Exception{
        FileOutputStream d=new FileOutputStream ("C:\\mywork\\docs\\fios5.txt",true);
        String j=("\nsomething is missing");
        byte [] v=j.getBytes();
        d.write(v);
        d.close();
    }

}

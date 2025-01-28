package fundementals.src.javaPrograms.ioOperations;

import java.io.FileOutputStream;

public class FileOPStream3 {
    public static void main(String[] args)throws Exception{
        FileOutputStream h=new FileOutputStream("C:\\mywork\\docs\\fios4.txt",true);
        String l=("\ntalk to you later");
        byte [] m=l.getBytes();
        h.write(m);
        h.close();
    }
}

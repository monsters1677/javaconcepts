package fundementals.src.javaPrograms.ioOperations;

import java.io.FileInputStream;

public class FileIPStream {
    public static void main(String[]args)throws Exception{
      FileInputStream f=new FileInputStream ("C:\\mywork\\docs\\fios5.txt");
        int size = f.available();
        byte[] bytes = new byte[size];
        f.read(bytes);
        String data = new String(bytes);
        System.out.println(data);
        f.close();
    }
}

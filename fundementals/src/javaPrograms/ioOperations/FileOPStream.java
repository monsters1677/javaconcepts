package fundementals.src.javaPrograms.ioOperations;


import java.io.FileOutputStream;

public class FileOPStream {
    public static void main(String[] args)throws Exception{
        FileOutputStream g=new FileOutputStream("C:\\mywork\\docs\\fos.txt",false);
        String f="\nI'm in Hyderabad";
        byte[] n=f.getBytes();
        g.write(n);
        g.close();
    }
}

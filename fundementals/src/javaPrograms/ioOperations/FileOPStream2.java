package fundementals.src.javaPrograms.ioOperations;

import java.io.FileOutputStream;

public class FileOPStream2 {
    public static void main(String[] args)throws Exception{
        FileOutputStream y= new FileOutputStream("C:\\mywork\\docs\\fos2.txt",true);
        String x="\nAAGIPOI VODIPOINA VADU UNNADU KANI PRAYATHNINCHI VODIPOINA VADU LEDU.....";
        byte[] z= x.getBytes();
        y.write(z);
        y.close();
    }
}

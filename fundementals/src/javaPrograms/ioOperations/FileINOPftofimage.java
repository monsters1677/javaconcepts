package fundementals.src.javaPrograms.ioOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileINOPftofimage {
    public static void main(String[] args){
        String trancferfile="C:\\Users\\Dasaratha\\OneDrive\\Pictures\\Pictures\\1671631453008.jpg";
        String targetfile="C:\\mywork\\docs\\1671631453008.jpg";
        try(
                FileInputStream F=new FileInputStream(trancferfile);
                FileOutputStream f=new FileOutputStream(targetfile);
                ) {
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

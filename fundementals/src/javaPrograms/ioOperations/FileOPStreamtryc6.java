package fundementals.src.javaPrograms.ioOperations;

import java.io.FileOutputStream;

public class FileOPStreamtryc6 {
    public static void main(String[] args){
        FileOutputStream g=null;
        try {
            g=new FileOutputStream("C:\\mywork\\docs\\fios5.txt",true);
            String f=("\nThis is my project...");
            byte[] j=f.getBytes();
            g.write(j);
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                g.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            }
        }



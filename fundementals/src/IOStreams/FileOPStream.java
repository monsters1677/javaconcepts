package IOStreams;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileOPStream {
    public static void main(String[] args){
        FileOutputStream fos=null;
        try{
            fos=new FileOutputStream("C:\\work space\\Creativity\\filo.txt",true);
            String text="where ever you go in the world the history is always false because this unrighteous people in every country";
            byte[] bytes=text.getBytes();
            fos.write(bytes);
        }catch (Exception g){
            g.printStackTrace();
        }finally {
            try {
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

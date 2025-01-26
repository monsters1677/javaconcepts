package IOStreams;

import java.io.FileInputStream;

public class FileIPStream {
    public static void main(String[] args)throws Exception{
        FileInputStream fis=new FileInputStream("C:\\work space\\Creativity\\file2.txt");
        int size=fis.available();
        byte[] bytes=new byte[size];
        fis.read(bytes);
        String result=new String(bytes);
        System.out.println(result);
    }
}

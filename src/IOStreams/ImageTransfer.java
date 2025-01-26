package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageTransfer {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\venka\\OneDrive\\Documents\\kishor_files\\photo.jpg");
        FileOutputStream fos=new FileOutputStream("C:\\work space\\Creativity\\photo1.jpg");
        int size= fis.available();
        byte[] b=new byte[size];
        fis.read();
        fos.write(b);
        System.out.println("the image transferred from C:\\Users\\venka\\OneDrive\\Documents\\kishor_files\\photo.jpg to C:\\work space\\Creativity\\photo1.jpg");
    }
}

package IOStreams;
import java.io.FileWriter;
public class FileWrite{
    public static void main(String[] args)throws Exception{
        FileWriter fw=new FileWriter("C:\\work space\\Creativity\\file2.txt",false);
        String data="I'm kishor from Nandyal. By the way what's your name";
        char[] c=data.toCharArray();
        fw.write(c);
        System.out.println("Go and check at C:\\work space\\Creativity\\file2.txt");
        fw.close();
    }
}

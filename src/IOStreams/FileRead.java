package IOStreams;

import java.io.FileReader;

public class FileRead {
    public static void main(String[] args)throws Exception{
        FileReader fr=new FileReader("C:\\work space\\Creativity\\file2.txt");
        int val=fr.read();
        String s="";
        while(val !=-1){
            s=s+(char)(val);
            val=fr.read();
        }
        System.out.println(s);
    }
}

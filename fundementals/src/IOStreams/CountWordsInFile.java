package IOStreams;

import java.io.FileInputStream;

public class CountWordsInFile {
    public static void main(String[] arg)throws Exception{
        FileInputStream fi=new FileInputStream("C:\\work space\\Creativity\\file1.txt");
        int size= fi.available();
        byte[] b=new byte[size];
        fi.read(b);
        String data=new String(b);
        String[] words=data.split(" ");
        int totalWords=words.length;
        System.out.println("total words :"+totalWords);
        int count=0;
        for (String element:words){
            if(element.equals("Krishna")){
                count++;
            }
        }
        System.out.println(count);
    }
}

package IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BRWordCount {
    public static void main(String[] args){
        String path="C:\\work space\\Creativity\\file1.txt";
        int count=0;
        try(
                BufferedReader br=new BufferedReader(new FileReader(path));
                ) {
            String text=br.readLine();
            String[] array=text.split(" ");
            for (int i=1;i<=array.length;i++){
                count+=1;
            }

            System.out.println("No of words :"+count);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

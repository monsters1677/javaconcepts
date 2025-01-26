package IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReverseContent {
    public static void main(String[] args){
        try(
                BufferedReader br= new BufferedReader(new FileReader("C:\\work space\\Creativity\\file1.txt"));
                ) {
            String line;
            while((line=br.readLine())!=null){
                String reverse=new StringBuilder(line).reverse().toString();
                line=br.readLine();
                System.out.println(reverse);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

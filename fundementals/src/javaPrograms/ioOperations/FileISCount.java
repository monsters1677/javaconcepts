package fundementals.src.javaPrograms.ioOperations;

import java.io.FileInputStream;

public class FileISCount {
    public static void main(String[] args){
        String f = "C:\\mywork\\docs\\fos.txt";
        //String f = E:/documents/welcome.txt
        try(
                FileInputStream s =new FileInputStream(f);
        ){
            int size = s.available();
            byte[] bytes = new byte[size];
            s.read(bytes);
            String data = new String(bytes);
            String[] words = data.split(" ");
            int wordsCount = words.length;
            System.out.println("No Of Words  : "+wordsCount);
            int durgaCount = 0;
            for (String word : words) {
                if(word.equalsIgnoreCase("durga")){
                    durgaCount = durgaCount + 1;
                }
            }
            System.out.println("Durga Count : "+durgaCount);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

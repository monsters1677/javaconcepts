package IOStreams;
import java.io.FileInputStream;
public class ToDisplayCommandLineArg {
    public static void main(String[] args){
        String fileName = args[0];
        try(
                FileInputStream fis=new FileInputStream(fileName);
        ){
            int size = fis.available();
            byte[] bytes = new byte[size];
            fis.read(bytes);
            String data = new String(bytes);
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

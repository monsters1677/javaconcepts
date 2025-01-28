package fundementals.src.javaPrograms.ioOperations;


    import java.io.FileOutputStream;
public class FileOPStreamtryc5 {
        public static void main(String[] args) {
            FileOutputStream f = null;
            try{
                f = new FileOutputStream("C:\\mywork\\docs\\fios5.txt",true);
                String a = "\nWelcome to Java Programming!";
                byte[] b = a.getBytes();
                f.write(b);
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                try {
                    f.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }




        }
    }



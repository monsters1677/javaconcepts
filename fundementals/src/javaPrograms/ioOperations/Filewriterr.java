package fundementals.src.javaPrograms.ioOperations;

import java.io.FileWriter;

public class Filewriterr {
    public static void main(String[] args) {
        try (
                FileWriter fg = new
                        FileWriter("C:\\mywork\\docs\\docs\\fios4.txt");
        ) {
            String data = ", It is very simple to learn";
            char[] c = data.toCharArray();
            fg.write(c);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

package fundementals.src.javaPrograms.ioOperations;

import java.io.FileInputStream;

public class FileIPStreamtryc4 {
    public static void main(String[] args) {
        FileInputStream L = null;
        try {
            L = new FileInputStream("C:\\mywork\\docs\\product.txt");
            int n = L.available();
            byte[] k = new byte[n];
            L.read(k);
            String s = new String(k);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

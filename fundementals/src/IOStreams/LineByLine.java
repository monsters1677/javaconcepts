package IOStreams;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineByLine {
    public static void main(String[] args) {
        String filePath = "C:\\work space\\Creativity\\file1.txt"; // Replace with the path to your file

            // Use try-with-resources to ensure the file is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

                // Read the file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
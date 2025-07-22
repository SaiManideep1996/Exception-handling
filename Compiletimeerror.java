import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("user.txt"));
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Please check the filename.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtils {
    public String readFile(File fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder string = new StringBuilder();
        while (reader.ready()) {
            string.append((char) reader.read());
        }
        reader.close();
        return string.toString();
    }

    public void writeFile(String str, String path) throws FileNotFoundException {
        // creates a file from file path parameter
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        pw.write(str);
        pw.close();

    }
    public static int countCharacters(String fileName) throws IOException {
        int chars = 0;
        BufferedReader charRead = new BufferedReader(new FileReader(fileName));
        while (charRead.ready()) {
            charRead.read();
            chars++;
        }
        charRead.close();
        return chars;
    }
    
}
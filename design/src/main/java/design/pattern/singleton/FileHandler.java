package design.pattern.singleton;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public static void writeFile(String filePath, String content) {
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

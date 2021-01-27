package IO;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Denis\\Desktop\\Test\\text.txt");
        file.mkdirs();
        file.createNewFile();
        Writer writer = new FileWriter(file);
        writer.write("HI!!!");
        writer.close();
    }
}

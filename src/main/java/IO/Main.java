package IO;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File fileToRead = new File("text.txt");
        File fileToWrite = new File("text1.txt");


//        try (FileReader fileReader = new FileReader(fileToRead);
//             FileWriter fileWriter = new FileWriter(fileToWrite)) {
//
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            String s = bufferedReader.readLine();
//            while (s != null){
//                bufferedWriter.write(s);
//                bufferedWriter.newLine();
//                s = bufferedReader.readLine();
//            }
//            bufferedWriter.flush();
//        }
        try (// ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileToWrite));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileToWrite));) {

//            outputStream.writeObject(new Cat());
//            outputStream.flush();
            Cat cat = (Cat) inputStream.readObject();
            System.out.println(cat);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

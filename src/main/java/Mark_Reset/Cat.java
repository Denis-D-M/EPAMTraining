package Mark_Reset;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Cat implements Serializable {
    public static void main(String[] args) throws IOException {
//        FileWriter fileWriter = new FileWriter("text1.txt");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("First Line");
//        bufferedWriter.newLine();
//        bufferedWriter.write("Second Line");
//        bufferedWriter.newLine();
//        bufferedWriter.write("Third Line");
//        bufferedWriter.newLine();
//        bufferedWriter.write("Fourth Line");
//        bufferedWriter.newLine();
//        bufferedWriter.write("Fifth Line");
//        bufferedWriter.newLine();
//        bufferedWriter.write("Sixth Line");
//        bufferedWriter.close();
          FileReader fileReader = new FileReader("text1.txt");
          BufferedReader bufferedReader = new BufferedReader(fileReader);
          List<String> arrayList = new ArrayList<>();
          arrayList.add(bufferedReader.readLine());
          bufferedReader.mark(2);
          arrayList.add(bufferedReader.readLine());
          arrayList.add(bufferedReader.readLine());
          arrayList.add(bufferedReader.readLine());
          bufferedReader.reset();
          arrayList.add(bufferedReader.readLine());
          bufferedReader.mark(1);
          arrayList.add(bufferedReader.readLine());
          arrayList.add(bufferedReader.readLine());
          bufferedReader.reset();
          arrayList.add(bufferedReader.readLine());
          arrayList.add(bufferedReader.readLine());
          System.out.println(arrayList);
          bufferedReader.close();
    }


}

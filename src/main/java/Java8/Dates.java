package Java8;


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.GregorianCalendar;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Dates {
    public static void main(String[] args) throws IOException {
        Callable<String> task = () -> "Hi";
        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTime = LocalDateTime.of(2000, 9, 30, 14, 30, 2);

    }
}

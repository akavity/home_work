package home_work_1.producer_queue_consumer.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileUtil {
    private final File file;
    private final String localDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));

    public FileUtil(String fileName) {
        this.file = new File(fileName);
    }

    public void write(String text) {
        try (FileWriter writer = new FileWriter(file, true);) {
            writer.write(localDateTime + "-" + Thread.currentThread().getName() + text + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

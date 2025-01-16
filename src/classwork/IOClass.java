package classwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOClass {
    public static void main(String[] args) {
        String sourceFile = "/path";
        String destinationFile = "/path";

        long startTime = System.currentTimeMillis();
        copyFile(sourceFile, destinationFile);
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken to copy the file: " + (endTime - startTime) + " milliseconds");
    }

    public static void copyFile(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
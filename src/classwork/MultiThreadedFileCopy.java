package classwork;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedFileCopy {
    private static final int THREAD_COUNT = 4;

    public static void main(String[] args) {
        String sourceFile = "D:\\Test\\mytest.zip";
        String destinationFile = "e:\\temp\\newTest.zip";

        long startTime = System.currentTimeMillis();
        copyFile(sourceFile, destinationFile);
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken to copy the file: " + (endTime - startTime) + " milliseconds");
    }

    public static void copyFile(String source, String destination) {
        File sourceFile = new File(source);
        long fileSize = sourceFile.length();
        long partSize = fileSize / THREAD_COUNT;

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            long start = i * partSize;
            long end = (i == THREAD_COUNT - 1) ? fileSize : (start + partSize);

            executorService.execute(new FileCopyTask(source, destination, start, end));
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // Wait for all threads to finish
        }
    }
}

class FileCopyTask implements Runnable {
    private String source;
    private String destination;
    private long start;
    private long end;

    public FileCopyTask(String source, String destination, long start, long end) {
        this.source = source;
        this.destination = destination;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try (RandomAccessFile sourceFile = new RandomAccessFile(source, "r");
             RandomAccessFile destinationFile = new RandomAccessFile(destination, "rw")) {

            sourceFile.seek(start);
            destinationFile.seek(start);

            byte[] buffer = new byte[1024];
            long bytesToRead = end - start;
            while (bytesToRead > 0) {
                int bytesRead = sourceFile.read(buffer, 0, (int) Math.min(buffer.length, bytesToRead));
                if (bytesRead == -1) {
                    break;
                }
                destinationFile.write(buffer, 0, bytesRead);
                bytesToRead -= bytesRead;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
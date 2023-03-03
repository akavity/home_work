package test.home_work_1.backupUtility;

import home_work_1.backupUtility.job.DirectoryCreator;
import home_work_1.backupUtility.supplier.FilesMarker;

import java.io.File;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Queue<File> queueContainer = new LinkedBlockingQueue<>();

        Thread filesMarker = new Thread(new FilesMarker(queueContainer, "testBackupUtility"));
        Thread directoryCreator1 = new Thread(new DirectoryCreator(queueContainer, "testBackupUtility/backup"));
        Thread directoryCreator2 = new Thread(new DirectoryCreator(queueContainer, "testBackupUtility/backup"));
        Thread directoryCreator3 = new Thread(new DirectoryCreator(queueContainer, "testBackupUtility/backup"));

        filesMarker.start();
        filesMarker.join();
        directoryCreator1.start();
        directoryCreator2.start();
        directoryCreator3.start();
    }
}

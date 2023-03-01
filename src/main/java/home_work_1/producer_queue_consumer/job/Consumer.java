package home_work_1.producer_queue_consumer.job;

import home_work_1.producer_queue_consumer.utils.FileUtil;

import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private final Queue<Integer> queue;
    private final String fileName;

    public Consumer(Queue<Integer> queue, String fileName) {
        this.queue = queue;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        FileUtil file = new FileUtil(fileName);
        Integer sleepTime = null;
        while ((sleepTime = queue.poll()) != null) {
            sleep(sleepTime);
            file.write(" - I slept " + sleepTime + " second(s)");
        }
        file.write(" ...");
        sleep(1);
    }

    private void sleep(Integer time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

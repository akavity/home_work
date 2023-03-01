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
        while (!Thread.currentThread().isInterrupted()) {
            FileUtil file = new FileUtil(fileName);
            while (queue.peek() != null && queue.peek() == -1) {
                Integer sleepTime = queue.poll();
                sleep(sleepTime);
                file.write(" - I slept " + sleepTime + " second(s)");
            }
            file.write(" ...");
            sleep(1);
        }
    }

    private void sleep(Integer time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

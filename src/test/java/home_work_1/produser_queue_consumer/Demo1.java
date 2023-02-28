package home_work_1.produser_queue_consumer;

import home_work_1.produser_queue_consumer.job.Consumer;
import home_work_1.produser_queue_consumer.supplier.Producer;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queueContainer = new LinkedBlockingQueue<>();

        Thread producer = new Thread(new Producer(queueContainer));
        Thread consumer1 = new Thread(new Consumer(queueContainer));
        Thread consumer2 = new Thread(new Consumer(queueContainer));
        Thread consumer3 = new Thread(new Consumer(queueContainer));

        producer.start();
        producer.join();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}

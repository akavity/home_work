package home_work_1.producer_queue_consumer.supplier;

import home_work_1.exceptions.UserInputException;

import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {
    private final Queue<Integer> queue;
    public static final Logger logger = Logger.getLogger(Producer.class.getName());

    public Producer(Queue<Integer> queueContainer) {
        this.queue = queueContainer;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int time;
        while (true) {
            try {
                if (scanner.hasNextInt()) {
                    time = scanner.nextInt();
                    if (time == -1) {
                        System.out.println("Goodbye");
                        queue.add(time);
                        break;
                    } else if (time >= 0) {
                        System.out.println("Time's has added");
                        queue.add(time);
                    } else {
                        throw new UserInputException("Write only positive numbers!");
                    }
                } else {
                    throw new UserInputException("Write only numbers!");
                }
            } catch (UserInputException e) {
                logger.log(Level.SEVERE, "Error message", e);
                scanner.next();
            }
        }
        scanner.close();
    }
}

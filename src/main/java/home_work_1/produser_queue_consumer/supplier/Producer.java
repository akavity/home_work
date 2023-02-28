package home_work_1.produser_queue_consumer.supplier;

import home_work_1.exceptions.UserInputException;

import java.util.Queue;
import java.util.Scanner;

public class Producer implements Runnable {
    private final Queue<Integer> queue;

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
                System.out.println(e.getMessage());
                scanner.next();
            }
        }
        scanner.close();
    }
}

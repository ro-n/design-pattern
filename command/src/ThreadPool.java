import abstraction.Command;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
    private final BlockingQueue<Command> queue;
    private final Thread[] threads;
    private volatile boolean shutdown;

    public ThreadPool(int numOfThreads) {
        queue = new LinkedBlockingQueue<>();
        threads = new Thread[numOfThreads];
        for (int i = 0; i < numOfThreads; i++) {
            threads[i] = new Worker("thread " + "i" + " in pool");
            threads[i].start();
        }
    }

    public void addCommand(Command cmd) {
        try {
            queue.put(cmd);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutdown() {
        while (!queue.isEmpty()) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        shutdown = true;
        for (Thread thread : threads) {
            System.out.println("shutting down " + thread.getId());
            thread.interrupt();
        }
    }

    private class Worker extends Thread
    {
        public Worker(String name) {
            super(name);
        }

        public void run() {
            while (!shutdown) {
                try {
                    Command cmd = queue.take();
                    cmd.execute();
                } catch (InterruptedException ignored) {}
            }
        }
    }
}

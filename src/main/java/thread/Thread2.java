package thread;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("thread2");

        for (int i = 0; i < 10; i++) {
            System.out.println("thread2 - " + Thread.currentThread().getName());
        }
    }

    public void join() throws InterruptedException {
        Thread.currentThread().join();
    }

    public void setPriority(int i) {
        Thread.currentThread().setPriority(i);
    }

    public int getPriority() {
        return Thread.currentThread().getPriority();
    }

    public void start() {
        run();
    }

    public void yield() {
        Thread.currentThread().yield();
    }

    public void sleep(int i) {
        try {
            System.out.println("thread2 sleep " + i + "ms");
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

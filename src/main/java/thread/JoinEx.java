package thread;

public class JoinEx {
    public static void main(String[] args) {
        // join 한 쓰레드가 끝날 때까지 기다린다.
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread2.start();
        thread1.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



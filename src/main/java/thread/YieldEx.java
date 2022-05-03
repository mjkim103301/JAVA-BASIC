package thread;

public class YieldEx {
    public static void main(String[] args) {
        // yield 하면 다른 쓰레드에게 양보하고 자신은 실행 대기 상태가 된다.
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
        thread2.yield();
    }
}


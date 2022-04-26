package thread;

public class YieldEx {
    public static void main(String[] args) {
        // yield 하면 다른 쓰레드에게 양보하고 자신은 실행 대기 상태가 된다.
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();

    }

    static class Thread1 extends Thread{
        @Override
        public void run() {
            System.out.println("thread1");
            Thread.yield();
            for(int i=0;i<10;i++){
                System.out.println("thread1 - "+getName());

            }
        }
    }
    static class Thread2 implements Runnable{

        @Override
        public void run() {
            System.out.println("thread2");
            for(int i=0;i<10;i++){
                System.out.println("thread2 - "+Thread.currentThread().getName());
            }
        }

        public void yield() {
            Thread.currentThread().yield();
        }

        public void start() {
            this.run();
        }
    }
}


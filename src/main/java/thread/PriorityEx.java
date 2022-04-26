package thread;

public class PriorityEx {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread2.setPriority(7);
        System.out.println("쓰레드1 우선순위는 " + thread1.getPriority());
        System.out.println("쓰레드2 우선순위는 " + thread2.getPriority());
        thread1.start();
        thread2.start();

    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.print("11");
            }

        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 200; i++) {
                System.out.print("22");
            }
        }
    }


}

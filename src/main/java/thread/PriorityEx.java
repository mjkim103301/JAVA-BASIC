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
}

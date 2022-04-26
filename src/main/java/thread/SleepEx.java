package thread;

public class SleepEx {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.run();
        thread2.run();
    }
    static class Thread1 extends Thread{
        @Override
        public void run() {
            System.out.println("thread1");
            try{
                System.out.println("sleep");
                Thread.sleep(3000L);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            for(int i=0;i<10;i++){
                System.out.println(getName());
                try{
                    System.out.println("sleep");
                    Thread.sleep(3000L);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    static class Thread2 implements Runnable{

        @Override
        public void run() {
            System.out.println("thread1");
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}


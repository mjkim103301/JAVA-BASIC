package thread;

public class JoinEx {
    public static void main(String[] args) {
        // join 한 쓰레드가 끝날 때까지 기다린다.
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread2.run();
        thread1.run();
//        try{
//            thread1.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }


        try{
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    static class Thread1 extends Thread{
        @Override
        public void run() {
            System.out.println("thread1");

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

        public void join() throws InterruptedException{
            Thread.currentThread().join();
        }
    }
}



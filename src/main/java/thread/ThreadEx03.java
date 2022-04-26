package thread;

public class ThreadEx03 {
    public static void main(String[] args) {
        //람다 표현식
        Thread thread=new Thread(()->System.out.println("world: "+ Thread.currentThread().getName()));
        thread.start();
        System.out.println("hello: "+Thread.currentThread().getName());


        //Thread, Runnable 실행 예제
        ThreadEx01 thread1=new ThreadEx01();
        thread1.run();
        thread1.start();
        ThreadEx02 thread2=new ThreadEx02();
        thread2.run();
        //thread2.start(); 에러
    }
}

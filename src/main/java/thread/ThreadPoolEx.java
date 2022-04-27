package thread;

import java.util.concurrent.*;

public class ThreadPoolEx {
    public static void main(String args[]) {
        // 스레드 풀 생성
        //1. 자동으로 스레드 수 생성
        ExecutorService executorServiceWithCached = Executors.newCachedThreadPool();

        //2. 원하는 개수만큼 생성
        ExecutorService executorServiceWithNum = Executors.newFixedThreadPool(2);

        //3. 최대치로 생성
        ExecutorService executorServiceWithMax = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        //4. 완전 수동
        // ThreadPoolExecutor( 코어 스레드 수, 최대 스레드 개수, 놀고 있는 시간, 놀고있는 시간 단위, 작업 큐 )
        ExecutorService executorServiceWithCustom = new ThreadPoolExecutor(3, 100, 120L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());

        // Runable 구현 객체 ( 익명구현객체 사용  )
        Runnable task1 = () -> {
            for (int index = 0; index < 100; index++) {
                System.out.println("작업 중입니다.");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Callable 구현 (반환값 있음)
        Callable<Boolean> task2 = () -> {
            Boolean isFinish = true;

            for (int index = 0; index < 100; index++) {
                System.out.println("작업 중입니다. Call");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return isFinish;
        };

        // 1. 리턴 값이 없는 단순 Runnable를 처리합니다.
        executorServiceWithCached.execute(task1);

        // 2. 리턴 가능한 Callable도 넣을 수 있는 메서드 입니다.
        Future<Boolean> returnBoolean = executorServiceWithCached.submit(task2);

        // main스레드의 작업이 멈추지 않기 위해 새로운 스레드로 구성
        executorServiceWithCached.execute(() -> {
            try {
                // 만약 특정 시간 내에 끝났는지 확인하려는 경우
                if (returnBoolean.get(1, TimeUnit.SECONDS)) {
                    System.out.println("작업이 완벽히 끝났습니다. ");
                }
            } catch (Exception e) {
                System.out.println("작업이 시간내에 끝나지 못했습니다.");
            }
        });

        // 작업 큐에 대기하고 있는 모든 작업이 끝난 뒤 스레드를 종료한다.
        executorServiceWithCached.shutdown();
    }

}

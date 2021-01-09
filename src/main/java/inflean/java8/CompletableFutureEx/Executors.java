package inflean.java8.CompletableFutureEx;

import java.util.concurrent.ExecutorService;

public class Executors {
    public static void main(String[] args) {
        ExecutorService executorService = java.util.concurrent.Executors.newSingleThreadExecutor();
        executorService.submit(()->{
            System.out.println("Tread " + Thread.currentThread().getName());
        });

        executorService.shutdown(); // 위에 돌고있는 쓰레드들이 끝나면 종료
                                    // shutdownNow 즉시 종료
    }
}

package java0.conc0303;

import com.sun.xml.internal.ws.util.CompletedFuture;

import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * 本周作业：（必做）思考有多少种方式，在main函数启动一个新线程或线程池，
 * 异步运行一个方法，拿到这个方法的返回值后，退出主线程？
 * 写出你的方法，越多越好，提交到github。
 * <p>
 * 一个简单的代码参考：
 */
public class Homework03 {

    private final static int DEFAULT_FIBO = 20;
    private final static int threadCount = 1;
    static int result ;
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long start = System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法

        //1.Future
        long startFuture = System.currentTimeMillis();
        Future<Integer> future = Executors.newCachedThreadPool().submit(() -> new ByCallable().call());

        result = future.get();//等待执行结果
        if (future.isDone()) {
            printExecuteResult("Future", result, startFuture);
        }
        //2.FutureTask
        long startFutureTask = System.currentTimeMillis();
        FutureTask<Integer> futureTask = new FutureTask<>(new ByCallable());
        new Thread(futureTask).start();
        printExecuteResult("FutureTask", futureTask.get(), startFutureTask);
        //3.CompletableFuture
        long startComplete = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(16);
        CompletableFuture<Integer> futureComplete = CompletableFuture.supplyAsync(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return fibo(DEFAULT_FIBO);
            }
        }, executor);
        futureComplete.thenAccept(res -> printExecuteResult("CompletableFuture", res, startComplete));
        executor.shutdown();
        //4.CountDownLatch
        long startLatch = System.currentTimeMillis();
        CountDownLatch latch = new CountDownLatch(threadCount);
        new Thread(new CountDownLatchTask(latch)).start();
        latch.await();
        printExecuteResult("CountDownLatch",result,startLatch);
        //5.CyclicBarrier
        long startBarrier = System.currentTimeMillis();
        CyclicBarrier barrier=new CyclicBarrier(threadCount);
        CompletableFuture<Void> futureBarry=CompletableFuture.runAsync(new CyclicBarrierTask(barrier));
        futureBarry.join();
        printExecuteResult("CyclicBarrier",result,startBarrier);


        //
//        int result = sum(); //这是得到的返回值
//
//        // 确保  拿到result 并输出
//        System.out.println("异步计算结果为：" + result);
//
        System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");

        // 然后退出main线程
    }


    private static void printExecuteResult(String future, Integer result, long start) {
        long end = System.currentTimeMillis();
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(start);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String startTime = sdf.format(c.getTime());

        long betweenMills = end - start;

        System.out.println(String.format("开始时间:%s 实现方法:%s 返回值：%d 间隔时间：%d 毫秒", startTime, future, result, betweenMills));
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if (a < 2)
            return 1;
        return fibo(a - 1) + fibo(a - 2);
    }

    static class ByCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return fibo(DEFAULT_FIBO);
        }
    }

    static class CountDownLatchTask implements Runnable {
        private CountDownLatch latch;

        public CountDownLatchTask(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
           Homework03.result= fibo(DEFAULT_FIBO);
           this.latch.countDown();
        }
    }

    static class CyclicBarrierTask implements Runnable{

        private CyclicBarrier barrier;
        public CyclicBarrierTask(CyclicBarrier barrier){
            this.barrier=barrier;
        }

        @Override
        public void run() {
            Homework03.result= fibo(DEFAULT_FIBO);
            try {
                barrier.await(2,TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
    }
}



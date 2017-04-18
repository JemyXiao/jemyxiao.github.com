package tk.mybatis.springboot.ThreadPool;

import java.util.concurrent.*;

/**
 * 避免线程池死锁的一种方法
 * Created by jmx on 17/3/26.
 */
public class ThreadPoolDeadLockAvidance {
    private final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            1,
            1,//最大线程池大小(有限数值)
            60, TimeUnit.SECONDS,
            //工作队列SynchronousQueue
            new SynchronousQueue<Runnable>(),
            //线程池饱和和处理策略CallerRunsRolicy:
            new ThreadPoolExecutor.CallerRunsPolicy());

    public static void main(String[] args) {
        ThreadPoolDeadLockAvidance me = new ThreadPoolDeadLockAvidance();
        me.test("<This will not DeadLock");
    }

    public void test(String message) {
        Runnable taskA = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing TaskA....");
                Runnable taskB = new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("TaskB process" + message);
                    }
                };
                Future<?> result = threadPoolExecutor.submit(taskB);
                //等待TskB执行结束才能执行TskA,使TsakA 和 TaskB 成为有依赖关系的两个任务
                try {
                    result.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                System.out.println("TaskA done.");
            }
        };
        threadPoolExecutor.submit(taskA);
    }
}


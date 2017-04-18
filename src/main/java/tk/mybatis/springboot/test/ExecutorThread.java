package tk.mybatis.springboot.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jmx on 16/4/27.
 */
public class ExecutorThread {
    public static void main(String[] args) {
        int f = 0;
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(() -> System.out.println(f));
        }
    }
}

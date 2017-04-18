package tk.mybatis.springboot;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jmx on 16/9/20.
 */
public class BufferInterruptibly {
    private ReentrantLock lock = new ReentrantLock();

    public void wirte() {
        lock.lock();
        try {
            long startTime = System.currentTimeMillis();
            System.out.println("开始往这个buffer写入数据");
            for (; ; ) {
                if (System.currentTimeMillis() - startTime > Integer.MAX_VALUE)
                    break;
            }
            System.out.println("终于写完了");
        } catch (Exception e) {

        } finally {
            lock.unlock();
        }
    }
}

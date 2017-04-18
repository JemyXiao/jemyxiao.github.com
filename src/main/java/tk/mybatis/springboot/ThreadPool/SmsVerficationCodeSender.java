package tk.mybatis.springboot.ThreadPool;

import java.util.concurrent.*;

/**
 * Created by jmx on 17/3/26.
 */
public class SmsVerficationCodeSender {
    private static  final ExecutorService EXECUTOR = new ThreadPoolExecutor(1,
            Runtime.getRuntime().availableProcessors(), 60, TimeUnit.SECONDS,
            new SynchronousQueue<Runnable>(), new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r,"VerfCodeSender");
            thread.setDaemon(true);
            return thread;
        }
    },new ThreadPoolExecutor.DiscardOldestPolicy());

    public void sendVerificationSms(final String msisdn) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                //
            }
        };
    }
}

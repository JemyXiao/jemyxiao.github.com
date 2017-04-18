package tk.mybatis.springboot.algorithms;

import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.client.AsyncRestTemplate;

/**
 * Created by jmx on 16/11/1.
 */
public class ResControllerTest {
    public static void main(String[] args) {
        AsyncRestTemplate asyncRestTemplate = new AsyncRestTemplate();
        ListenableFuture future = asyncRestTemplate.getForEntity("",ResControllerTest.class);
        future.addCallback(new ListenableFutureCallback() {
            @Override
            public void onFailure(Throwable throwable) {

            }

            @Override
            public void onSuccess(Object o) {

            }
        });
    }
}

package tk.mybatis.springboot.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by jmx on 16/10/11.
 */
public class Lambda {
    public static void main(String[] args) {
//        int a = 0;
//        Runnable x = () -> System.out.println(a);
        int [] iArrs = {1,2,3,4,5,6};
        Arrays.stream(iArrs).map((x) -> x = x +1).forEach(System.out::println);
        Arrays.stream(iArrs).forEach(System.out :: println);
    }
}

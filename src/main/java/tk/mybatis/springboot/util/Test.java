package tk.mybatis.springboot.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by jmx on 16/8/26.
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("name");
        stringJoiner.add("sex");
        System.out.println(stringJoiner.toString());

    }
}

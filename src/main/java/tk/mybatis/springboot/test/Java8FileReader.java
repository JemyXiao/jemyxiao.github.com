package tk.mybatis.springboot.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by jmx on 17/3/2.
 */
public class Java8FileReader {
    public static void main(String[] args) throws IOException {
//       System.out.println(new String(Files.readAllBytes(Paths.get("/Users/caiyongqiao/Downloads/testFileNio.txt")), Charset.forName("utf-8")));
        Files.lines(Paths.get("/Users/caiyongqiao/Downloads/testFileNio.txt"),StandardCharsets.UTF_8).forEach(System.out::println);
    }
}

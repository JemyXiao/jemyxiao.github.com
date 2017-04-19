package tk.mybatis.springboot.test;

/**
 * Created by jmx on 17/4/6.
 */
public class TestSynchroized {
    public synchronized void test1() {
        System.out.println("asdfasf");
        System.out.println("test");
        TestSynchroized testSynchroized = new TestSynchroized();
        testSynchroized.test2();
    }
    public synchronized void test2() {
        System.out.println("cheng");
    }

    public static void main(String[] args) {
        TestSynchroized testSynchroized = new TestSynchroized();
        testSynchroized.test1();
        TestSynchroized testSynchroized1 = new TestSynchroized();
        testSynchroized1.test2();
    }
}

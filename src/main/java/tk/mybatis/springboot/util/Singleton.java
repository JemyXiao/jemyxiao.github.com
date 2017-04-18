package tk.mybatis.springboot.util;

/**
 * Created by jmx on 16/9/20.
 */
public class Singleton {
    /**
     * 私有构造方法,防止被实例化
     */
    private Singleton() {
    }

    /**
     * 此处使用一个内部类来维护单例
     */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    /**
     * 获取单例
     * @return
     */
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

}

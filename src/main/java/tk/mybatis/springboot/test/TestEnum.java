package tk.mybatis.springboot.test;

/**
 * Created by jmx on 16/5/17.
 */
public enum TestEnum {
    RED(1),GREEN(2),YELLOW(3),BLUE(4);
    private int value;

    TestEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value+"";
    }
}

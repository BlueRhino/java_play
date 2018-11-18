package priv.bluerhino.java.playground;

/**
 * Created by niekunlin @ 18/11/14.
 * @author niekunlin
 */
public class SimpleCalculator2 {

    /**
     * 简单处理溢出情况
     */
    public int addInt(int a, int b) {
        if (isOverFlow(a, b)) {
            throw new RuntimeException("计算溢出");
        }
        return a + b;
    }

    boolean isOverFlow(int x, int y) {
        int z = x + y;
        if (x > 0 && y > 0 && z < 0) {
            return true;
        }
        return x < 0 && y < 0 && z > 0;
    }

}

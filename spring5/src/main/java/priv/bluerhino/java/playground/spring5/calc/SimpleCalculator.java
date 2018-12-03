package priv.bluerhino.java.playground.spring5.calc;

/**
 * Created by niekunlin @ 18/11/14.
 * @author niekunlin
 */
public class SimpleCalculator  implements Adder{

    /**
     * 并没有处理溢出情况
     *
     */
    @Override
    public int addInt(int a, int b) {
        return a + b;
    }

}

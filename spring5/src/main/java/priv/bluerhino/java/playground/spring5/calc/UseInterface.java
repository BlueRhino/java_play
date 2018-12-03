package priv.bluerhino.java.playground.spring5.calc;

/**
 * Created by niekunlin @ 18/11/29.
 *
 * @author niekunlin
 */
public class UseInterface {

    public static void main(String[] args) {
        Adder adder = new OverflowCalculator();
        System.out.println(adder.addInt(5, 6));
        System.out.println(adder.addInt(Integer.MAX_VALUE, 6));
    }

}

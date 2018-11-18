package priv.bluerhino.java.playground;

/**
 * Hello world!
 *
 * @author niekunlin
 */
public class UseNew
{
    public static void main( String[] args )
    {
        SimpleCalculator2 simpleCalculator = new SimpleCalculator2();
        System.out.println(simpleCalculator.addInt(Integer.MIN_VALUE,-100));
    }
}

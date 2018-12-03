package priv.bluerhino.java.playground.spring5.calc;

/**
 * Hello world!
 *
 * @author niekunlin
 */
public class UseNew
{
    public static void main( String[] args )
    {
        //使用FoolCalculator
        FoolCalculator foolCalculator = new FoolCalculator();
        System.out.println(foolCalculator.addInt(5,6));
        //计算器开发人员改进了计算机
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        System.out.println(simpleCalculator.addInt(5,6));
        System.out.println(simpleCalculator.addInt(Integer.MAX_VALUE,6));
        //计算器开发人员增加了溢出判断
        OverflowCalculator overflowCalculator = new OverflowCalculator();
        System.out.println(overflowCalculator.addInt(5,6));
        System.out.println(overflowCalculator.addInt(Integer.MAX_VALUE,6));
    }
}

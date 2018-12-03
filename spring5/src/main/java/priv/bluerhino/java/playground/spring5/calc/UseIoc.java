package priv.bluerhino.java.playground.spring5.calc;

import priv.bluerhino.java.playground.spring5.myioc.MyIoc;

/**
 * Created by niekunlin @ 18/11/29.
 * @author niekunlin
 */
public class UseIoc {
    public static void main(String[] args) {
        MyIoc myIoc = new MyIoc();
        Adder adder = myIoc.getBean(Adder.class);
        System.out.println(adder.addInt(5, 6));
        System.out.println(adder.addInt(Integer.MAX_VALUE, 6));
    }


}

package priv.bluerhino.java.playground.spring5.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.bluerhino.java.playground.spring5.calc.Adder;

/**
 * Created by niekunlin @ 18/12/3.
 *
 * @author niekunlin
 */
public class Launcher {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Adder bean = applicationContext.getBean("adder_fool",Adder.class);
        System.out.println(bean.addInt(5, 6));
    }
}

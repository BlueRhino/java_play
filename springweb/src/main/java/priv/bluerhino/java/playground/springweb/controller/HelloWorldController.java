package priv.bluerhino.java.playground.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by niekunlin @ 18/11/19.
 *
 * @author niekunlin
 */
@Controller
public class HelloWorldController {

    public HelloWorldController() {
        System.out.println("-----------------");
        System.out.println(this.toString());
    }

    @RequestMapping(path = "hello", method = RequestMethod.GET)
    public ModelAndView sayHello() {
        return new ModelAndView("hello").addObject("now", new Date().toString());
    }

}

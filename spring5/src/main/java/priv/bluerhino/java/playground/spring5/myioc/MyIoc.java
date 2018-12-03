package priv.bluerhino.java.playground.spring5.myioc;

import java.util.ServiceLoader;

/**
 * Created by niekunlin @ 18/11/28.
 * @author niekunlin
 */
public class MyIoc {


    public Object getBean(String className) throws Exception {
        Class<?> aClass = Class.forName(className);
        return aClass.newInstance();
    }

    public <T> T getBean(Class<T> classes){
        ServiceLoader<T> loader = ServiceLoader.load(classes);
        T res = null;
        if(loader.iterator().hasNext()){
            res = loader.iterator().next();
        }
        return res;
    }



}

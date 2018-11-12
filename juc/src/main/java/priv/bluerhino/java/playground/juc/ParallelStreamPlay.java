package priv.bluerhino.java.playground.juc;

import com.google.common.base.Stopwatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by niekunlin @ 18/11/3.
 * @author niekunlin
 */
public class ParallelStreamPlay {

    public static void main(String[] args){
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,13};
        List<Integer> listOfIntegers =
                new ArrayList<>(Arrays.asList(intArray));
        Stopwatch stopwatch = Stopwatch.createStarted();
        System.out.println(stopwatch.elapsed(TimeUnit.SECONDS));
        long count = listOfIntegers
                .parallelStream()
                .peek(x -> {
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).count();
        System.out.println(stopwatch.elapsed(TimeUnit.SECONDS));
        System.out.println(count);
    }


}

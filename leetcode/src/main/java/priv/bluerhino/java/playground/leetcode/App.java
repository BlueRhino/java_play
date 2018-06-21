package priv.bluerhino.java.playground.leetcode;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock writeLock = readWriteLock.writeLock();
        Lock readLock = readWriteLock.readLock();
        readLock.lock();
        writeLock.lock();

    }
}

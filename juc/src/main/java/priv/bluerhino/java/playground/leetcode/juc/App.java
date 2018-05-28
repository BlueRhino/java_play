package priv.bluerhino.java.playground.leetcode.juc;

import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        ReadThread readThread1 = new ReadThread(readWriteLock.readLock());
        ReadThread readThread2 = new ReadThread(readWriteLock.readLock());
        WriteThread writeThread = new WriteThread(readWriteLock.writeLock());
        new Thread(readThread1).start();
        new Thread(readThread2).start();
        new Thread(writeThread).start();
        System.in.read();
    }

    public static class ReadThread implements Runnable {

        private Lock readLock;

        public ReadThread(Lock readLock) {
            this.readLock = readLock;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":read begin.");
            readLock.lock();
            System.out.println(Thread.currentThread().getName() + ":reading");
            readLock.unlock();
            System.out.println(Thread.currentThread().getName() + ":read end.");
        }
    }

    public static class WriteThread implements Runnable{

        private Lock writeLock;

        public WriteThread(Lock writeLock) {
            this.writeLock = writeLock;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":write begin.");
            writeLock.lock();
            System.out.println(Thread.currentThread().getName() + ":writing");
            writeLock.unlock();
            System.out.println(Thread.currentThread().getName() + ":write end.");
        }
    }

}

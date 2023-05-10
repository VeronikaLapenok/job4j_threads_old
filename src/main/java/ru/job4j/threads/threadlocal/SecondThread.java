package ru.job4j.threads.threadlocal;

public class SecondThread extends Thread {
    @Override
    public void run() {
        ThreadLocalDemo.tl.set("This is the second thread");
        System.out.println(ThreadLocalDemo.tl.get());
    }
}

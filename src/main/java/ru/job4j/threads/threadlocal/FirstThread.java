package ru.job4j.threads.threadlocal;

public class FirstThread extends Thread {
    @Override
    public void run() {
        ThreadLocalDemo.tl.set("This is the first thread");
        System.out.println(ThreadLocalDemo.tl.get());
    }
}

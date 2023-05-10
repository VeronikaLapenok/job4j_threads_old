package ru.concurrent;

public class ThreadState {
    public static void main(String[] args) {
        Thread first = new Thread(
                () -> printState(Thread.currentThread())
        );
        printState(first);

        Thread second = new Thread(
                () -> printState(Thread.currentThread())
        );
        printState(second);

        first.start();
        second.start();

        while (first.getState() != Thread.State.TERMINATED
                || second.getState() != Thread.State.TERMINATED) {
            printState(first);
            printState(second);
        }
        printState(first);
        printState(second);
    }

    public static void printState(Thread thread) {
        System.out.println(thread.getName() + ": " + thread.getState());
    }
}

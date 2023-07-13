package ru.job4j.concurrent;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountTest {
    @Test
    public void whenExecute2ThreadThen2() throws InterruptedException {
        var count = new Count();
        var first = new Thread(count::increment);
        var second = new Thread(count::increment);
        /* Running threads */
        first.start();
        second.start();
        /* Making the main thread wait for our threads to complete */
        first.join();
        second.join();
        /* Check the result */
        Assertions.assertEquals(2, count.get());
    }
}

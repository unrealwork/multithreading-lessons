package com.unrealwork.lesson.multithread.start.demo2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner implements Runnable {
    private Logger logger = LoggerFactory.getLogger(Runner.class);

    public void run() {
        for (int i = 0; i < 10; i++) {
            logger.info("Hello {}", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.error("{}", e);
                Thread.currentThread().interrupt();
            }
        }
    }
}

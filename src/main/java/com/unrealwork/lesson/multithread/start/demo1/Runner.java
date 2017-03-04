package com.unrealwork.lesson.multithread.start.demo1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Runner extends Thread {
    private Logger logger = LoggerFactory.getLogger(Runner.class);

    @Override
    public void run() {
        super.run();
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

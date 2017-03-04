package com.unrealwork.lesson.multithread.start.demo3;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
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
        });

        thread.start();
    }
}

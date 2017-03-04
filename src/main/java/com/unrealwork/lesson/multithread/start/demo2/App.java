package com.unrealwork.lesson.multithread.start.demo2;


public class App {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner());
        Thread thread2 = new Thread(new Runner());

        thread1.start();
        thread2.start();
    }
}

package com.qiu.tang.local;

public class MyStringTask implements Runnable {
    private String name;

    MyStringTask(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            if (null == MyThreadLocal.threadLocal.get()) {
                MyThreadLocal.threadLocal.set("a");
                System.out.println("线程" + name + ": a");
            } else {
                String str = (String) MyThreadLocal.threadLocal.get();
                MyThreadLocal.threadLocal.set(str + "a");
                System.out.println("线程" + name + ": " + MyThreadLocal.threadLocal.get());
            }
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

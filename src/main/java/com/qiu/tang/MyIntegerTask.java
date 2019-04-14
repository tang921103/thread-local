package com.qiu.tang;

public class MyIntegerTask implements Runnable {
    private String name;

    MyIntegerTask(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            // ThreadLocal.get方法获取线程变量
            if (null == MyThreadLocal.threadLocal.get()) {
                // ThreadLocal.et方法设置线程变量
                MyThreadLocal.threadLocal.set(0);
                System.out.println("线程" + name + ": 0");
            } else {
                int num = (Integer) MyThreadLocal.threadLocal.get();
                MyThreadLocal.threadLocal.set(num + 1);
                System.out.println("线程" + name + ": " + MyThreadLocal.threadLocal.get());
                if (i == 3) {
                    MyThreadLocal.threadLocal.remove();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

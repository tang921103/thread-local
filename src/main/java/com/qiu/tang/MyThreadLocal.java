package com.qiu.tang;

public class MyThreadLocal {
    /*
    线程变量
     */
    public static final ThreadLocal<Object> threadLocal = new ThreadLocal<Object>();
    protected Object initialValue(){
        System.out.println("调用get方法时，当前线程共享变量没有设置，调用initialValue获取默认值！");
        return null;
    }
    public static void main(String[] args)
    {
        new Thread(new MyIntegerTask("IntegerTask1")).start();
//        new Thread(new MyStringTask("StringTask1")).start();
        new Thread(new MyIntegerTask("IntegerTask2")).start();
//        new Thread(new MyStringTask("StringTask2")).start();
    }
}

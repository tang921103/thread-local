package com.qiu.tang.enums;

public class EnumTest {
    public static void main(String[] args){
//        System.out.println(Color.RED);
//        System.out.println(Color.RED.toString());
//        Color red = Color.RED;
//        System.out.println(red.ordinal());
//        System.out.println(Color.BLUE.ordinal());
            Color color = Color.getByKey("reds");
        System.out.println(color.toString());
        Color c  = Color.valueOf("BLUE");
        System.out.println(c);
    }
}

package com.qiu.tang.enums;

public enum Color {
    RED("reds","color_red"),
    BLUE("blue","color_blue"),
    ORANGE("orange","color_orange"),
    WHITE("white","color_white");
    private final String key;
    private final String value;

    Color(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public static Color getByKey(String key){
        if(null == key){
            return null;
        }
        for(Color color : Color.values()){
            if(key.equals(color.getKey())){
                return color;
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

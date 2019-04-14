package com.qiu.tang.json;

import java.io.Serializable;

public class Lion implements Serializable {
    private String name;
    private Integer age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Lion(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}

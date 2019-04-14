package com.qiu.tang.json;


import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class Cat implements Serializable {
    @JSONField(name = "catname")
    private String name;
    private Integer age;
    @JSONField(serialize = false)
    private String color;
    @JSONField(format = "YYYY/MM/dd")
    private Date birth;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Cat() {
    }

    public Cat(String name, Integer age, String color, Date birth) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", birth=" + birth +
                '}';
    }
}

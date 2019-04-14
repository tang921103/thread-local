package com.qiu.tang.json;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

public class Animals implements Serializable {
    private Dog dog;
    private Cat cat;
    @JSONField(name = "jsonlions")
    private List<Lion> lions;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public List<Lion> getLions() {
        return lions;
    }

    public void setLions(List<Lion> lions) {
        this.lions = lions;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", lions=" + lions +
                '}';
    }
}

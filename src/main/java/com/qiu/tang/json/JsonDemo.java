package com.qiu.tang.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsonDemo {
    public static void main(String[] args){
        System.out.println("start");
        ThreadLocal<Object> threadLocal = new ThreadLocal<Object>();
        Animals animals = new Animals();
        Dog dog = new Dog();
        dog.setName("dog");
        dog.setColor("white");
        dog.setAge(2);
        Cat cat = new Cat();
        cat.setName("cat");
        cat.setColor("black");
        cat.setAge(4);
        cat.setBirth(new Date());
        animals.setCat(cat);
        animals.setDog(dog);
        List<Lion> list = new ArrayList<Lion>();
        Lion l1 = new Lion("lion1",2,"blue");
        Lion l2 = new Lion("lion2",5,"orange");
        list.add(l1);
        list.add(l2);
        animals.setLions(list);
        String json1 = JSON.toJSONString(animals);
        System.out.println(json1);
        threadLocal.set(json1);
        System.out.println("==============");
        Animals obj = JSONObject.parseObject((String)threadLocal.get(),Animals.class);
        System.out.println(obj.getCat().getBirth());
        System.out.println(obj.getDog().getColor());
        System.out.println(obj.getLions().get(0));
        System.out.println(obj);
        System.out.println("end");

    }
}

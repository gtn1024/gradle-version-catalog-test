package com.github.gtn1024.entry;

import cn.hutool.core.bean.BeanUtil;
import com.github.gtn1024.shared.BeanUtils;

public class Main {
    public static void main(String[] args) {
        User user = new User("gtn1024", 18);

        System.out.println(BeanUtil.beanToMap(user));

        System.out.println(BeanUtils.beanToMap(user));
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.gaussic.model;

import java.io.Serializable;

/**
 * Created by Chris on 2017/11/10.
 */

public class Student implements Serializable {

    String name;
    String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

package com.offcn.pojo;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Author: zxy
 * @Date: 2021/1/28 22:50
 * @Description:
 */

public class User implements Serializable {

    private long id;
    private String name;
    private Integer age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
}

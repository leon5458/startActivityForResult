package com.hly.intent;

import java.io.Serializable;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/7/23~~~~~~
 * ~~~~~~更改时间:2018/7/23~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class DateBean implements Serializable{
    private String name;
    private String age;

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

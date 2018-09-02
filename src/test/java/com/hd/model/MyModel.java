package com.hd.model;

import lombok.Data;

/**
 * @author fanzhenxing
 * @create 2018/9/1 8:41 PM
 */

public class MyModel {
    private String name;
    private String sex;
    private String test;

    public MyModel(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
}

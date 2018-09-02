package com.hd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author BigFan
 * @create 2018/9/1 9:22 PM
 */
@Data
@AllArgsConstructor
public class MyInfo implements Serializable {
    private String name;
    private String age;
    private String description;
}

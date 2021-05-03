package com.bian.pojo;

import lombok.Data;

/**
 * @author Kevin
 * @Data 2021/4/18
 */
@Data
public class Student {
    private int id;
    private String name;
    //多对一，多个学生对应一个老师
    private Teacher teacher;
}

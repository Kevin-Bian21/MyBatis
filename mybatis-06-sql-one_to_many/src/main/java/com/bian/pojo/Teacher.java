package com.bian.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author Kevin
 * @Data 2021/4/18
 */
@Data
public class Teacher {
    private int id;
    private String name;
    //一对多的关系；一个老师有多个学生
    private List<Student> students ;
}

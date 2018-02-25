package com.example.admin.forbeshomework;


/**
 * Created by vv on 04.05.2017.
 */
public class Person {
    String name;
    String flag_res;
    String money;

    public Person(String name, String money, String flag_res) {
        this.flag_res = flag_res.replace("R.drawable.","");
        this.money = money;
        this.name = name;
    }
}

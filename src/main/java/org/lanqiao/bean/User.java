package org.lanqiao.bean;

import java.io.Serializable;

/**
 * Created by 刘安 on 2017/8/30.
 */
public class User implements Serializable{
    private Integer id;
    private String name;
    private String password;

    public void printHello(){
        System.out.println("Spring hello  "+name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

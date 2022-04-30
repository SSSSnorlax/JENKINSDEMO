package com.snorlax.jenkinsdemo.entity;

/**
 * @Author: Snorlax
 * @Date: 2022/4/30 22:50
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class User {
    private String name;
    private Integer age;
    private String address;
    private String sex;
    private String phone;
    private String email;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, Integer age, String address, String sex, String phone, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

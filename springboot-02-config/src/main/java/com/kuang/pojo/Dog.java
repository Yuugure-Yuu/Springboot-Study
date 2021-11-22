package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "dog")
public class Dog {

    @Value("旺财")
    private String firstName;
    @Value("3")
    private Integer age;

    public Dog() {
    }

    public Dog(String firstName, Integer age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}

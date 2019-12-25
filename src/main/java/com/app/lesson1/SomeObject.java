package com.app.lesson1;

/**
 * @author Sergey Klunniy
 */
public class SomeObject {
    public String name;
    private int age;

    public SomeObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void go(){}

    @Override
    public String toString() {
        return "SomeObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.app;

/**
 * @author Sergey Klunniy
 */
public  class Human extends H{
    private String name;
    private int age;
    public String hobby;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

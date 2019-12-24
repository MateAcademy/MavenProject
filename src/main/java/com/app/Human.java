package com.app;

/**
 * @author Sergey Klunniy
 */
public  class Human {
    private String name;
    private int age;
    public String hobby;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("say Hello  ");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}

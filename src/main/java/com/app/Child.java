package com.app;

/**
 * @author Sergey Klunniy
 */
class Base{
    protected void print(){
        System.out.println("1");
    }
}

public class Child extends Base{

    public void print() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Base obj = new Child();
         obj.print();
    }
}

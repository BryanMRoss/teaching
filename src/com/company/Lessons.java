package com.company;

public class Lessons {

    public static void main(String[] args) {
        System.out.println("HELLO WORLD!!");
        // Subclass example
        SubclassExample sub = new SubclassExample();
        sub.sayHello();  // this is overriden method
        sub.declareFun(); // this is just inherited from the super class
    }
}

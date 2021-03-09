package com.company;

abstract class AbstractExample {
    public String exl;
    public AbstractExample() {
        this.exl = "Wow, this is fun!";
    }

    public void sayHello () {
        System.out.println("Hello!");
    }

    public void declareFun() {
        System.out.println(exl);
    }
}

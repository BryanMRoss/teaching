package com.company;

public class SubclassExample extends AbstractExample {
    String myName;

    public SubclassExample() {
        this.myName = new String("DUDE");
    }

    public SubclassExample(String nm) {
        this.myName = nm;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Hello " + myName + "!!");
    }
}

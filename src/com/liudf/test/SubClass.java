package com.liudf.test;

public class SubClass extends ParentClass{
    public SubClass() {
        System.out.println("i am a " + this.getClass().getName());
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println("ending !!!");
    }
}

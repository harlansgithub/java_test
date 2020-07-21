package com.liudf.test;

public class MainTest {
    public static void test(FunctionInterfaceTest functionInterfaceTest){
        functionInterfaceTest.test();
    }
    public static void main(String[] args) {
        test(()-> System.out.println("hello"));
    }
}

package com.liudf.test;

@FunctionalInterface
public interface FunctionInterfaceTest {
    public void test();
    default void test2(){
    }
    public static void test3(){

    }
}

package com.liudf.test;

import sun.applet.Main;

public class MethodParamTest {
    private final MainTest reader;
    public MethodParamTest(MainTest reader){
        this.reader = reader;
    }
    public static void main(String[] args) {
        int a = 1;
        testParam(a);
        System.out.println("main param a is " + a);

        String b = "i am a original string";
        testRefParam(b);
        System.out.println(b);

        OriginalObject originalObject = new OriginalObject();
        originalObject.setName("lisi");
        testObjectRef(originalObject);
        System.out.println("lisi " + originalObject.getName());
    }
    public static void testParam(int a){
        a = 5;
        System.out.println("test param is " + a);
    }
    public static void testRefParam(String a){
        a = "i was changed!!!";
        System.out.println(a);
    }

    public static void testObjectRef(final OriginalObject object){
        object.setName("zhangsan");
        System.out.println("zhangsan " + object.getName());
    }
}

package com.liudf.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("hello_threadtest"));
        thread.start();
    }
}

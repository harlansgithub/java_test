package com.liudf.shutdownhook;

/**
 * 钩子函数：JVM进程结束之前会执行所有的钩子函数，钩子函数执行完毕之后，JVM进程才会退出JVM
 */
public class ShutdownHookTest {
    public static void main(String[] args) {
        System.out.println(ShutdownHookTest.class.getName() + "started!!!");
        HookTestThread shutdownHookTest = new HookTestThread();
        // 注册ShutdownHook, 不必显示调用start方法，而是JVM退出时会自动调用start方法
        Runtime.getRuntime().addShutdownHook(shutdownHookTest);
        System.out.println(ShutdownHookTest.class.getName() + "stoped!!!");
    }
}
class HookTestThread extends Thread{
    public void run(){
        System.out.println("hook test thread exit!!!");
    }
}
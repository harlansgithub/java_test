package com.liudf.lambda;

import sun.rmi.server.InactiveGroupException;

import java.util.function.Function;

/**
 * 数据转换
 */
public class FunctionConvert {
    public static void main(String[] args) {
        int i  = function("1000",(String something)->{
           return Integer.valueOf(something);
        });
        System.out.println(i);
        i = andFunction("2000",(String something)->Integer.valueOf(something),(Integer something)->Integer.valueOf(something));
        System.out.println(i);
    }
    private static Integer function(String something, Function<String,Integer> function){
        return function.apply(something);
    }
    private  static Integer andFunction(String something,Function<String ,Integer> function,Function<Integer,Integer> integerFunction){
        return function.andThen(integerFunction).apply(something);
    }
}

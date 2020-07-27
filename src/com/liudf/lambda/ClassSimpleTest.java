package com.liudf.lambda;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * 使用class简写调用，方法调用，类的静态方法调用，实例方法调用
 */
public class ClassSimpleTest {
    public static void main(String[] args) {
        Consumer<Integer> con = (x) -> System.out.println(x);
        con.accept(1000);

        Consumer<Integer> con2 = System.out::println;
        con2.accept(12000);

        BiFunction<Integer,Integer,Integer> biFun = (x,y) -> Integer.compare(x,y);
        BiFunction<Integer,Integer,Integer> biFun2 = Integer::compareTo;
        Integer result = biFun2.apply(1000,200);
        System.out.println(result);

        BiFunction<String,String,Boolean> biFun3 = (str,str2) -> str.equals(str2);
        BiFunction<String,String,Boolean> biFun4 = String::equals;
        System.out.println(biFun4.apply("hello", "world"));

    }
}

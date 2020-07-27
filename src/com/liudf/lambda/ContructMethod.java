package com.liudf.lambda;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 构造方法的使用
 */
public class ContructMethod {
    public static void main(String[] args) {
        // 构造方法引用
        Supplier<String> sup = () -> new String();
        System.out.println(sup.get());
        Supplier<String> sup2 = String::new;
        System.out.println(sup2.get());

        // 构造方法引用，带一个参数
        Function<String,Integer> sup3 = (x) -> new Integer(x);
        Function<String,Integer> sup4 = Integer::new;
        System.out.println(sup4.apply("200"));
    }
}

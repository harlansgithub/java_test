package com.liudf.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Supplier;

/**
 * @ClassName StreamTest
 * @Description 流处理
 * @Author liudianfei3
 * @Date 2020/7/28 11:26
 * @Version 1.0
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("lisi");
        list.add("huangshan");

//        list.stream().map(x->x+"r").forEach( x-> System.out.println(x));
        User user = new User();
        list.stream().filter(x->x.equals("lisi")).forEach(x->user.setName(x));
        System.out.println(user.getName());
    }
}

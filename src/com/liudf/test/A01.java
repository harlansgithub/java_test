package com.liudf.test;

import java.util.Scanner;

/**
 * 判断一个整数是不是整数
 * 2020-07-23 23:54
 */
public class A01 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int count2 = count - 1;
        if ((count & count2) == 0){
            System.out.println("是偶数");
        }else {
            System.out.println("不是偶数");
        }
    }
}

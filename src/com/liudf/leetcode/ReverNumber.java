package com.liudf.leetcode;

/**
 * 数字反转
 * 时间复杂度 O(log(x))
 * 空间复杂度(O(1))
 */
public class ReverNumber {
    public static void main(String[] args) {
        int number = -74088202;
        System.out.println(revert(number));

    }

    public static int revert(int x){
        int rev = 0;
        while (x != 0){
           int pop =  x % 10;
           x /= 10;
           rev = rev*10 + pop;
        }
        return rev;
    }
}

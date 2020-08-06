package com.leetcode;

import java.util.Arrays;

/**
 * @ClassName TwoNumSum
 * @Description 求出两数之和等于N的所有的数组元素的索引
 * @Author liudianfei3
 * @Date 2020/7/29 11:38
 * @Version 1.0
 */
public class TwoNumSum {
    static Integer[] nums = {3,5,7,4,2,10,11,9,1};
    static Integer target = 10;
    public static void main(String[] args) {
        Integer[] temp = new Integer[nums.length];
        // 拷贝数组用来保存索引
        System.arraycopy(nums,0,temp,0,temp.length);
        // 数组元素排序
        Arrays.sort(nums);
        // 双路指针查找
        for (int i = 0,j = nums.length-1;i<j;){
            if (nums[i] + nums[j] > target){
                j--;
            }else if (nums[i] + nums[j] < target){
                i++;
            }else {
                System.out.println(getLeftIndex(nums[i],temp)+","+getRightIndex(nums[j],temp));
                i++;
                j--;
            }
        }
    }
    public static Integer getLeftIndex(Integer value,Integer[] temp){
        Integer index = null;
        for (int i = 0;i<temp.length;i++) {
            if (value == temp[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static Integer getRightIndex(Integer value,Integer[] temp){
        Integer index = null;
        for (int i = temp.length-1;i>=0;i--) {
            if (value == temp[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}

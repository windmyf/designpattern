package com.myf.designpattern.strategy;
/**
 * @Author : myf
 * @Date : 2020/10/25 22:13
 * @Description : 自己写Comparable接口
 * @Version : 1.0
 */
public interface MyComparable<T> {

    int compareTo(T o);
}

package com.myf.designpattern.strategy;

/**
 * @Author : myf
 * @Date : 2020/11/2 14:16
 * @Description : 比较器
 * @Version : 1.0
 */
public interface MyComparator<T> {

    int compare(T o1, T o2);
}

package com.myf.designpattern.strategy;

import java.util.Arrays;

/**
 * @Author : myf
 * @Date : 2020/10/25 22:00
 * @Description : 测试类
 * @Version : 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        Dog[] d = {new Dog(5),new Dog(2),new Dog(4)};

        MySorter<Dog> sorter = new MySorter<>();
        sorter.sort(d,new DogComparator());

        System.out.println(Arrays.toString(d));
    }
}

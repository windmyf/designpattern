package com.myf.designpattern.abstractfactory;

import com.myf.designpattern.factory.Moveable;

/**
 * @Author : myf
 * @Date : 2020/11/2 14:58
 * @Description : 车
 * @Version : 1.0
 */
public class Car extends Vehicle{

    @Override
    public void go(){
        System.out.println(" 汽车开动了。。。。。。");
    }
}

package com.myf.designpattern.factory;
/**
 * @Author : myf
 * @Date : 2020/11/2 14:58
 * @Description : 车
 * @Version : 1.0
 */
public class Car implements Moveable {

    @Override
    public void go(){
        System.out.println(" 汽车开动了。。。。。。");
    }
}

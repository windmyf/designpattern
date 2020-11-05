package com.myf.designpattern.factory;
/**
 * @Author : myf
 * @Date : 2020/11/2 15:08
 * @Description : 汽车工厂
 * @Version : 1.0
 */
public class CarFactory {

    public Moveable createCar(){

        System.out.println("一辆汽车被创建出来了");
        return new Car();
    }
}

package com.myf.designpattern.factory;
/** 
 * @Author : myf
 * @Date : 2020/11/2 15:05
 * @Description : 简单工厂，可扩展性差
 * @Version : 1.0
 */
public class SingleVehicleFactory {

    public Car createCar(){

        // 前置操作
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }
}

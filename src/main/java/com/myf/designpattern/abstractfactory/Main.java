package com.myf.designpattern.abstractfactory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory factory = new MordenFactory();
        Vehicle vehicle = factory.createVehicle();
        vehicle.go();

        Food food = factory.createFood();
        food.printName();

        Weapon weapon = factory.createWeapon();
        weapon.shoot();

    }
}

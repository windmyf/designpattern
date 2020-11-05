package com.myf.designpattern.factory;

public class Main {

    public static void main(String[] args) {
        Moveable moveable = new Car();
        moveable.go();
    }
}

package com.myf.designpattern.singleton;
/**
 * @Author : myf
 * @Date : 2020/10/25 21:00
 * @Description : 与Singleton01意思相同
 * @Version : 1.0
 */
public class MySingleton02 {

    private static final MySingleton02 INSTANCE;

    static {
        INSTANCE = new MySingleton02();
    }

    private MySingleton02(){

    }

    public static MySingleton02 getInstance(){
        return  INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        MySingleton02 mySingleton011 = MySingleton02.getInstance();
        MySingleton02 mySingleton012 = MySingleton02.getInstance();
        System.out.println(mySingleton011 == mySingleton012);
    }
}

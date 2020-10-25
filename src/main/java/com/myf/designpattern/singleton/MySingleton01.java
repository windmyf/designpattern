package com.myf.designpattern.singleton;
/**
 * @Author : myf
 * @Date : 2020/10/25 21:00
 * @Description : 单例模式---饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 唯一缺点：不管用到与否，类加载时就完成实例化
 * @Version : 1.0
 */
public class MySingleton01 {

    private static final MySingleton01 INSTANCE = new MySingleton01();

    private MySingleton01(){

    }

    public static MySingleton01 getInstance(){
        return  INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        MySingleton01 mySingleton011 = MySingleton01.getInstance();
        MySingleton01 mySingleton012 = MySingleton01.getInstance();
        System.out.println(mySingleton011 == mySingleton012);
    }
}

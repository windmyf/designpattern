package com.myf.designpattern.singleton;
/**
 * @Author : myf
 * @Date : 2020/10/25 21:00
 * @Description : 不仅可以解决线程同步，还可以防止反序列化
 * @Version : 1.0
 */
public enum  MySingleton08 {

    INSTANCE;

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(MySingleton08.INSTANCE.hashCode());
            }).start();
        }
    }
}

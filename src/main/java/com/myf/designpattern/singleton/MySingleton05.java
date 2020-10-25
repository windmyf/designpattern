package com.myf.designpattern.singleton;
/**
 * @Author : myf
 * @Date : 2020/10/25 21:00
 * @Description : 单例模式---懒汉式
 * 通过synchronized解决线程不安全问题，双重检查
 * @Version : 1.0
 */
public class MySingleton05 {

    private static MySingleton05 INSTANCE;

    private MySingleton05(){

    }

    public static MySingleton05 getInstance(){
        if (INSTANCE==null){
            synchronized (MySingleton05.class) {
                // 双重检查
                if (INSTANCE == null){
                    try {
                        Thread.sleep(1);
                        INSTANCE = new MySingleton05();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return  INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(MySingleton05.getInstance().hashCode());
            }).start();
        }
    }
}

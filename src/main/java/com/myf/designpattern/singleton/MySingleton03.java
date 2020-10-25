package com.myf.designpattern.singleton;
/**
 * @Author : myf
 * @Date : 2020/10/25 21:00
 * @Description : 单例模式---懒汉式
 * 虽然达到了初始化的目的，多线程的时候可能会有线程不安全问题
 * @Version : 1.0
 */
public class MySingleton03 {

    private static MySingleton03 INSTANCE;

    private MySingleton03(){

    }

    public static MySingleton03 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(1000);
                INSTANCE = new MySingleton03();
            } catch (InterruptedException e) {
                e.printStackTrace();
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
                System.out.println(MySingleton03.getInstance().hashCode());
            }).start();
        }
    }
}

package com.myf.designpattern.singleton;
/**
 * @Author : myf
 * @Date : 2020/10/25 21:00
 * @Description : 单例模式---懒汉式
 * 通过synchronized解决线程不安全问题，但也带来效率下降
 * @Version : 1.0
 */
public class MySingleton04 {

    private static MySingleton04 INSTANCE;

    private MySingleton04(){

    }

    public static synchronized MySingleton04 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(1);
                INSTANCE = new MySingleton04();
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
                System.out.println(MySingleton04.getInstance().hashCode());
            }).start();
        }
    }
}

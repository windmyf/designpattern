package com.myf.designpattern.singleton;
/**
 * @Author : myf
 * @Date : 2020/10/25 21:00
 * @Description : 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * @Version : 1.0
 */
public class MySingleton06 {



    private MySingleton06(){

    }

    /**
     * 静态内部类，外部类被加载时内部类不会被加载
     */
    private static class MySingleton06Holder{
        // 初始化外部类对象
        private static MySingleton06 INSTANCE = new MySingleton06();
    }

    public static MySingleton06 getInstance(){
        return  MySingleton06Holder.INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(MySingleton06.getInstance().hashCode());
            }).start();
        }
    }
}

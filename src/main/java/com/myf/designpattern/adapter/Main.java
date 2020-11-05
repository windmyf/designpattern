package com.myf.designpattern.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @Author : myf
 * @Date : 2020/11/5 17:06
 * @Description : 转换器模式
 * @Version : 1.0
 */
public class Main {

    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream("文件");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String readLine = bufferedReader.readLine();
        while (readLine!=null&& !readLine.equals("")){
            System.out.println(readLine);
        }
        bufferedReader.close();

    }
}

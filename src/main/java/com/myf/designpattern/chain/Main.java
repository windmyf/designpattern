package com.myf.designpattern.chain;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Msg msg = new Msg();
        msg.setMsg("<script> 欢迎大家访问***,访问地址为：dushutiandi.com,大家都是996");
        System.out.println("msg = " + msg);


        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new SensitiveFilter());

        FilterChain filterChain1 = new FilterChain();
        filterChain1.add(new FaceFilter());
        filterChain1.add(new URLFilter());
        filterChain1.add(filterChain);


        filterChain.doFilter(msg);

        System.out.println("msg = " + msg);

    }

}

class Msg{
    String name;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

class HTMLFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        // 处理msg
        String s = msg.getMsg();
        s = s.replace('<','[').replace('>',']');
        msg.setMsg(s);
        return true;
    }
}

class SensitiveFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        // 处理msg
        String s = msg.getMsg();
        s = s.replace("996","955");
        msg.setMsg(s);
        return false;
    }
}

class FaceFilter implements Filter{

    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("***","读书天地");
        msg.setMsg(s);
        return true;
    }
}

class URLFilter implements Filter{

    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("dushutiandi.com","https://dushutiandi.com");
        msg.setMsg(s);
        return true;
    }
}

interface Filter{
    boolean doFilter(Msg msg);
}

class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg){
        for (Filter filter: filters){
            if (!filter.doFilter(msg)){
                return false;
            }
        }
        return true;
    }
}
package com.itheima.dao.impl;
import com.itheima.dao.UserDao;
public class UserDaoimpl implements UserDao{

    public void init(){
        System.out.println("初始化方法...");
    }
    public void save(){
        System.out.println("save running");
    }
    public void destory(){
        System.out.println("销毁方法...");
    }
}

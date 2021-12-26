package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoimpl;

public class staticFactory {
    public  UserDao getUserdao(){
        return new UserDaoimpl();
    }
}

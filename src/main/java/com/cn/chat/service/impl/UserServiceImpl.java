package com.cn.chat.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;  

import com.cn.chat.dao.UserMapper;
import com.cn.chat.pojo.User;
import com.cn.chat.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  
package com.wlc.picture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wlc.picture.model.entity.User;
import com.wlc.picture.service.UserService;
import com.wlc.picture.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author w'l'pa'r
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2025-02-03 15:53:30
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





package com.wlc.picture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wlc.picture.model.dto.user.UserQueryRequest;
import com.wlc.picture.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wlc.picture.model.vo.LoginUserVO;
import com.wlc.picture.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author w'l'pa'r
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-02-03 15:53:30
*/
public interface UserService extends IService<User> {
    long userRegister(String userAccount, String userPassword, String checkPassword);
    String getEncryptPassword(String userPassword);
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);
    LoginUserVO getLoginUserVO(User user);
    User getLoginUser(HttpServletRequest request);
    boolean userLogout(HttpServletRequest request);
    UserVO getUserVO(User user);
    List<UserVO> getUserVOList(List<User> userList);
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);
    boolean isAdmin(User user);
}

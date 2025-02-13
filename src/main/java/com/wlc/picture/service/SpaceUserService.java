package com.wlc.picture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wlc.picture.model.dto.spaceuser.SpaceUserAddRequest;
import com.wlc.picture.model.dto.spaceuser.SpaceUserQueryRequest;
import com.wlc.picture.model.entity.SpaceUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wlc.picture.model.vo.SpaceUserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author w'l'pa'r
* @description 针对表【space_user(空间用户关联)】的数据库操作Service
* @createDate 2025-02-08 10:31:47
*/
public interface SpaceUserService extends IService<SpaceUser> {
    long addSpaceUser(SpaceUserAddRequest spaceUserAddRequest);
    void validSpaceUser(SpaceUser spaceUser, boolean add);
    SpaceUserVO getSpaceUserVO(SpaceUser spaceUser, HttpServletRequest request);
    List<SpaceUserVO> getSpaceUserVOList(List<SpaceUser> spaceUserList);
    QueryWrapper<SpaceUser> getQueryWrapper(SpaceUserQueryRequest spaceUserQueryRequest);

}

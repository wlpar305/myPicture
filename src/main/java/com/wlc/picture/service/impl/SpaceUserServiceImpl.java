package com.wlc.picture.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wlc.picture.model.entity.SpaceUser ;
import com.wlc.picture.service.SpaceUserService;
import com.wlc.picture.mapper.SpaceUserMapper;
import org.springframework.stereotype.Service;

/**
* @author w'l'pa'r
* @description 针对表【space_user(空间用户关联)】的数据库操作Service实现
* @createDate 2025-02-08 10:31:47
*/
@Service
public class SpaceUserServiceImpl extends ServiceImpl<SpaceUserMapper, SpaceUser>
    implements SpaceUserService{

}





package com.wlc.picture.controller;

import com.wlc.picture.annotation.AuthCheck;
import com.wlc.picture.common.BaseResponse;
import com.wlc.picture.common.ResultUtils;
import com.wlc.picture.constant.UserConstant;
import com.wlc.picture.exception.BusinessException;
import com.wlc.picture.exception.ErrorCode;
import com.wlc.picture.exception.ThrowUtils;
import com.wlc.picture.model.dto.space.SpaceAddRequest;
import com.wlc.picture.model.dto.space.SpaceUpdateRequest;
import com.wlc.picture.model.entity.Space;
import com.wlc.picture.model.entity.User;
import com.wlc.picture.service.SpaceService;
import com.wlc.picture.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/space")
public class SpaceController {
    @Resource
    private UserService userService;

    @Resource
    private SpaceService spaceService;

    @PostMapping("/add")
    public BaseResponse<Long> addSpace(@RequestBody SpaceAddRequest spaceAddRequest, HttpServletRequest request) {
        ThrowUtils.throwIf(spaceAddRequest == null, ErrorCode.PARAMS_ERROR);
        User loginUser = userService.getLoginUser(request);
        long newId = spaceService.addSpace(spaceAddRequest, loginUser);
        return ResultUtils.success(newId);
    }

    @PostMapping("/update")
    @AuthCheck(mustRole = UserConstant.ADMIN_ROLE)
    public BaseResponse<Boolean> updateSpace(@RequestBody SpaceUpdateRequest spaceUpdateRequest,
                                             HttpServletRequest request) {
        if (spaceUpdateRequest == null || spaceUpdateRequest.getId() <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Space space = new Space();
        BeanUtils.copyProperties(spaceUpdateRequest, space);
        spaceService.fillSpaceBySpaceLevel(space);
        spaceService.validSpace(space, false);
        long id = spaceUpdateRequest.getId();
        Space oldSpace = spaceService.getById(id);
        ThrowUtils.throwIf(oldSpace == null, ErrorCode.NOT_FOUND_ERROR);
        boolean result = spaceService.updateById(space);
        ThrowUtils.throwIf(!result, ErrorCode.OPERATION_ERROR);
        return ResultUtils.success(true);
    }
}

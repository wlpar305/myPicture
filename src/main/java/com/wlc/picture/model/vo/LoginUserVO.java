package com.wlc.picture.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LoginUserVO implements Serializable {

    private Long id;
    private String userAccount;
    private String userName;
    private String userAvatar;
    private String userProfile;
    private String userRole;
    private Date editTime;
    private Date createTime;
    private Date updateTime;
    private static final long serialVersionUID = 1L;
}

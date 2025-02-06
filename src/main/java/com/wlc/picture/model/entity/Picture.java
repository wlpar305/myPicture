package com.wlc.picture.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@TableName(value ="picture")
@Data
public class Picture implements Serializable {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String url;
    private String thumbnailUrl;
    private String name;
    private String introduction;
    private String category;
    private String tags;
    private Long picSize;
    private Integer picWidth;
    private Integer picHeight;
    private Double picScale;
    private String picFormat;
    private String picColor;
    private Long userId;
    private Long spaceId;
    private Integer reviewStatus;
    private String reviewMessage;
    private Long reviewerId;
    private Date reviewTime;
    private Date createTime;
    private Date editTime;
    private Date updateTime;

    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
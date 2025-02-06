package com.wlc.picture.model.dto.picture;

import com.wlc.picture.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PictureQueryRequest extends PageRequest implements Serializable {
    private Long id;
    private String name;
    private String introduction;
    private String category;
    private List<String> tags;
    private Long picSize;
    private Integer picWidth;
    private Integer picHeight;
    private Double picScale;
    private String picFormat;
    private String searchText;
    private Long userId;
    private Integer reviewStatus;
    private String reviewMessage;
    private Long reviewerId;
    private Date reviewTime;
    private Long spaceId;
    private boolean nullSpaceId;
    private Date startEditTime;
    private Date endEditTime;
    private static final long serialVersionUID = 1L;
}

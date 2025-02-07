package com.wlc.picture.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureUploadRequest implements Serializable {
    private Long id;
    private String fileUrl;
    private String picName;
    //private Long spaceId;
    private static final long serialVersionUID = 1L;
}

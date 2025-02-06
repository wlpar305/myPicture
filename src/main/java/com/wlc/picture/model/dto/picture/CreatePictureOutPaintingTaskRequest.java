package com.wlc.picture.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreatePictureOutPaintingTaskRequest implements Serializable {
    private Long pictureId;
    //private CreateOutPaintingTaskRequest.Parameters parameters;
    private static final long serialVersionUID = 1L;
}

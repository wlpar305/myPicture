package com.wlc.picture.manager.auth;

import com.wlc.picture.model.entity.Picture;
import com.wlc.picture.model.entity.Space;
import com.wlc.picture.model.entity.SpaceUser;
import lombok.Data;

@Data
public class SpaceUserAuthContext {
    private Long id;
    private Long pictureId;
    private Long spaceId;
    private Long spaceUserId;
    private Picture picture;
    private Space space;
    private SpaceUser spaceUser;
}

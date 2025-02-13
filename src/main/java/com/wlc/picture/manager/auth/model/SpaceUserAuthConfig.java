package com.wlc.picture.manager.auth.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SpaceUserAuthConfig implements Serializable {
    private List<SpaceUserPermission> permissions;
    private List<SpaceUserRole> roles;
    private static final long serialVersionUID = 1L;
}

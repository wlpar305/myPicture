package com.wlc.picture.manager.websocket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PictureEditRequestMessage {
    private String type;
    private String editAction;
}

package com.wlc.picture.manager.websocket.disruptor;

import com.wlc.picture.manager.websocket.model.PictureEditRequestMessage;
import com.wlc.picture.model.entity.User;
import lombok.Data;
import org.springframework.web.socket.WebSocketSession;

@Data
public class PictureEditEvent {
    private PictureEditRequestMessage pictureEditRequestMessage;
    private WebSocketSession session;
    private User user;
    private Long pictureId;
}

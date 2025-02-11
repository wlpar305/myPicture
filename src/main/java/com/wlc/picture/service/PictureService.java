package com.wlc.picture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wlc.picture.api.aliyunai.model.CreateOutPaintingTaskResponse;
import com.wlc.picture.model.dto.picture.*;
import com.wlc.picture.model.entity.Picture ;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wlc.picture.model.entity.User;
import com.wlc.picture.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;
import com.wlc.picture.model.dto.picture.CreatePictureOutPaintingTaskRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author w'l'pa'r
* @description 针对表【picture(图片)】的数据库操作Service
* @createDate 2025-02-06 11:08:39
*/
public interface PictureService extends IService<Picture> {
    PictureVO uploadPicture(Object inputSource,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);
    void validPicture(Picture picture);
    void doPictureReview(PictureReviewRequest pictureReviewRequest, User loginUser);
    void fillReviewParams(Picture picture, User loginUser);
    Integer uploadPictureByBatch(PictureUploadByBatchRequest pictureUploadByBatchRequest,
                                 User loginUser);
    void clearPictureFile(Picture oldPicture);
    void deletePicture(long pictureId, User loginUser);
    void checkPictureAuth(User loginUser, Picture picture);
    void editPicture(PictureEditRequest pictureEditRequest, User loginUser);
    List<PictureVO> searchPictureByColor(Long spaceId, String picColor, User loginUser);
    void editPictureByBatch(PictureEditByBatchRequest pictureEditByBatchRequest, User loginUser);
    CreateOutPaintingTaskResponse createPictureOutPaintingTask(CreatePictureOutPaintingTaskRequest createPictureOutPaintingTaskRequest, User loginUser);

}

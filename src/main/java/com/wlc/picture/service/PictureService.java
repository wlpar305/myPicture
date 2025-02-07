package com.wlc.picture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wlc.picture.model.dto.picture.PictureQueryRequest;
import com.wlc.picture.model.dto.picture.PictureReviewRequest;
import com.wlc.picture.model.dto.picture.PictureUploadByBatchRequest;
import com.wlc.picture.model.dto.picture.PictureUploadRequest;
import com.wlc.picture.model.entity.Picture ;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wlc.picture.model.entity.User;
import com.wlc.picture.model.vo.PictureVO;
import com.wlc.picture.model.dto.picture.PictureEditRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

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
}

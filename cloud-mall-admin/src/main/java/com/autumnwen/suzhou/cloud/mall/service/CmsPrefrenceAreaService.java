package com.autumnwen.suzhou.cloud.mall.service;

import com.autumnwen.suzhou.cloud.mall.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 优选专区Service
 * Created by macro on 2018/6/1.
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}
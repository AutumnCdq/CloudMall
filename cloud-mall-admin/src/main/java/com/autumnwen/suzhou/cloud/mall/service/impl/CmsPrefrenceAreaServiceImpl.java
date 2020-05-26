package com.autumnwen.suzhou.cloud.mall.service.impl;

import com.autumnwen.suzhou.cloud.mall.mapper.CmsPrefrenceAreaMapper;
import com.autumnwen.suzhou.cloud.mall.model.CmsPrefrenceArea;
import com.autumnwen.suzhou.cloud.mall.model.CmsPrefrenceAreaExample;
import com.autumnwen.suzhou.cloud.mall.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}

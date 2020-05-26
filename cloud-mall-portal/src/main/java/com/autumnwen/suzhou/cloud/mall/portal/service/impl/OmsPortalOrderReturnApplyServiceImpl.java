package com.autumnwen.suzhou.cloud.mall.portal.service.impl;

import com.autumnwen.suzhou.cloud.mall.mapper.OmsOrderReturnApplyMapper;
import com.autumnwen.suzhou.cloud.mall.model.OmsOrderReturnApply;
import com.autumnwen.suzhou.cloud.mall.portal.domain.OmsOrderReturnApplyParam;
import com.autumnwen.suzhou.cloud.mall.portal.service.OmsPortalOrderReturnApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 订单退货管理Service实现类
 * Created by macro on 2018/10/17.
 */
@Service
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;
    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        OmsOrderReturnApply realApply = new OmsOrderReturnApply();
        BeanUtils.copyProperties(returnApply,realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert(realApply);
    }
}

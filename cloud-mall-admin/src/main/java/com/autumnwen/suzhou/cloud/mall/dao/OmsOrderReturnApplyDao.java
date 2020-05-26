package com.autumnwen.suzhou.cloud.mall.dao;

import com.autumnwen.suzhou.cloud.mall.dto.OmsOrderReturnApplyResult;
import com.autumnwen.suzhou.cloud.mall.dto.OmsReturnApplyQueryParam;
import com.autumnwen.suzhou.cloud.mall.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单退货申请自定义Dao
 * Created by macro on 2018/10/18.
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}

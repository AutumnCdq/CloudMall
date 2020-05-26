package com.autumnwen.suzhou.cloud.mall.dto;

import com.autumnwen.suzhou.cloud.mall.model.PmsProductCategory;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by macro on 2018/5/25.
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    @ApiModelProperty("子级分类")
    private List<PmsProductCategory> children;

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }
}

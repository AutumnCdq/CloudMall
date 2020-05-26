package com.autumnwen.suzhou.cloud.mall.dto;

import com.autumnwen.suzhou.cloud.mall.model.UmsPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 后台权限节点封装
 * Created by macro on 2018/9/30.
 */
public class UmsPermissionNode extends UmsPermission {
    @Getter
    @Setter
    private List<UmsPermissionNode> children;
}

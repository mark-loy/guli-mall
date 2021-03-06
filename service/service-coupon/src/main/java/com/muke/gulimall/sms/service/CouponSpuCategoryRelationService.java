package com.muke.gulimall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.muke.common.utils.PageUtils;
import com.muke.gulimall.sms.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author muke
 * @email mark-loy@163.com
 * @date 2021-02-26 12:23:44
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.muke.gulimall.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.muke.gulimall.sms.entity.SkuFullReductionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品满减信息
 * 
 * @author muke
 * @email mark-loy@163.com
 * @date 2021-02-26 12:23:44
 */
@Mapper
public interface SkuFullReductionDao extends BaseMapper<SkuFullReductionEntity> {
	
}

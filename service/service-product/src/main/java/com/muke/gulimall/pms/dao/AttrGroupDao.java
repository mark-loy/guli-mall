package com.muke.gulimall.pms.dao;

import com.muke.gulimall.pms.entity.AttrGroupEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.muke.gulimall.pms.vo.web.ItemSkuInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性分组
 * 
 * @author muke
 * @email mark-loy@163.com
 * @date 2021-02-26 10:43:54
 */
@Mapper
public interface AttrGroupDao extends BaseMapper<AttrGroupEntity> {

    List<ItemSkuInfoVo.SpuItemBaseAttr> getItemSpuBaseAttr(@Param("spuId") Long spuId, @Param("catalogId") Long catalogId);
}

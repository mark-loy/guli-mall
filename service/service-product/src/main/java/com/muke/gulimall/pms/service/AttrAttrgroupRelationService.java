package com.muke.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.muke.common.utils.PageUtils;
import com.muke.gulimall.pms.entity.AttrAttrgroupRelationEntity;
import com.muke.gulimall.pms.vo.AttrGroupVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author muke
 * @email mark-loy@163.com
 * @date 2021-02-26 10:43:54
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void deleteAttrgroupRelation(List<AttrGroupVo> deleteVos);
}


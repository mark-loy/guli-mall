package com.muke.gulimall.ums.dao;

import com.muke.gulimall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author muke
 * @email mark-loy@163.com
 * @date 2021-02-26 12:20:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

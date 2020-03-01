package com.codev.mall.msg.mapper;
 

import com.codev.mall.msg.entity.Massage;
import com.codev.mall.msg.vo.MassageVO;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;

/**
 * <p>
  * $!{table.comment} Mapper 接口
 * </p>
 *
 * @author godV
 * @since 2020-02-29
 */
public interface MassageMapper extends BaseMapper<Massage> {
	
	@Select("SELECT massage.* ,userinfo.username  FROM massage,userinfo WHERE massage.useq=userinfo.seq ")
    List<MassageVO> getMsgInfoAll();
	
	
	@Select("SELECT massage.* ,userinfo.username  FROM massage left join userinfo on massage.useq=userinfo.seq "
			+ " ${ew.customSqlSegment}")
	IPage<MassageVO> getMsgInfoByPage(IPage<MassageVO> page,@Param(Constants.WRAPPER) Wrapper<MassageVO> queryWrapper);
 
}
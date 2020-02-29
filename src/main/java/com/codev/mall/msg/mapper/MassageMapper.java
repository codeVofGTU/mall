package com.codev.mall.msg.mapper;
 
import com.codev.mall.catering.vo.CateringinfoVO;
import com.codev.mall.msg.entity.Massage;
import com.codev.mall.msg.vo.MassageVO;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
 
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
 
}
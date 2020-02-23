package com.codev.mall.catering.mapper;
 
import com.codev.mall.catering.entity.Cateringinfo;
import com.codev.mall.catering.vo.CateringinfoVO;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
 
/**
 * <p>
  * $!{table.comment} Mapper 接口
 * </p>
 *
 * @author godV
 * @since 2020-02-16
 */
public interface CateringinfoMapper extends BaseMapper<Cateringinfo> {
 
	
	@Select("SELECT cateringinfo.*,business.username,classification.name FROM cateringinfo,business,classification WHERE cateringinfo.bseq=business.seq and cateringinfo.ccseq = classification.seq")
    List<CateringinfoVO> getCateringinfoAll();

}
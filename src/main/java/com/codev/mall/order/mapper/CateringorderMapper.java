package com.codev.mall.order.mapper;
 
import com.codev.mall.order.entity.Cateringorder;
import com.codev.mall.order.vo.CateringorderVO;

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
public interface CateringorderMapper extends BaseMapper<Cateringorder> {
	
	@Select("SELECT cateringorder.*,userinfo.username FROM cateringorder,userinfo WHERE cateringorder.useq=userinfo.seq ")
    List<CateringorderVO> getCateringorderAll();
}
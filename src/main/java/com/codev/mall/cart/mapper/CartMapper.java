package com.codev.mall.cart.mapper;
 
import com.codev.mall.cart.entity.Cart;
import com.codev.mall.cart.vo.CartVO;
import com.codev.mall.order.vo.OrderinfoVO;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
 
/**
 * <p>
  * $!{table.comment} Mapper 接口
 * </p>
 *
 * @author godV
 * @since 2020-02-16
 */
public interface CartMapper extends BaseMapper<Cart> {
	
	@Select("SELECT cart.*,cateringinfo.* FROM cart left join cateringinfo "
			+ " on cart.ciseq=cateringinfo.seq"
			+ " ${ew.customSqlSegment}")
    List<CartVO> getCartByUseq(@Param(Constants.WRAPPER) Wrapper<OrderinfoVO> queryWrapper);
 
}
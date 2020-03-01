package com.codev.mall.order.mapper;
 
import com.codev.mall.order.entity.Orderinfo;
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
public interface OrderinfoMapper extends BaseMapper<Orderinfo> {
	
	
	@Select("SELECT orderinfo.*,cateringinfo.cateringname,cateringinfo.price 'cprice',cateringinfo.picture_Path 'picture_Path' "
			+ "FROM orderinfo join cateringinfo on orderinfo.ciseq=cateringinfo.seq"
			+ " ${ew.customSqlSegment}")
    List<OrderinfoVO> getOrderinfoAll(@Param(Constants.WRAPPER) Wrapper<OrderinfoVO> queryWrapper);
	
	
	/**
    *
    * 如果自定义的方法还希望能够使用MP提供的Wrapper条件构造器，则需要如下写法
    *
    * @param userWrapper
    * @return
    
   @Select("SELECT * FROM user ${ew.customSqlSegment}")
   List<User> selectByMyWrapper(@Param(Constants.WRAPPER) Wrapper<User> userWrapper);

   /**
    * 和Mybatis使用方法一致
    * @param name
    * @return
    
   @Select("SELECT * FROM user where name = #{name}")
   List<User> selectByName(@Param("name") String name);
   */
}
package com.codev.mall.cart.service;

import com.codev.mall.cart.entity.Cart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
/**
 * <p>
 * $!{table.comment} 服务类
 * </p>
 *
 * @author godV
 * @since 2020-02-16
 */
public interface ICartService extends IService<Cart> {
 
	
	/**
     *  分页查询
     * @param Cart
     * @return
     */
	ResponseBodyBean<List<Cart>> selectPage(PageQueryBody<Cart> vo);
}

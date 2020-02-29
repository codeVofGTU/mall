package com.codev.mall.cart.service.impl;
 


import com.codev.mall.cart.entity.Cart;
import com.codev.mall.cart.mapper.CartMapper;
import com.codev.mall.cart.service.ICartService;
import com.codev.mall.cart.vo.CartVO;
import com.codev.mall.order.vo.OrderinfoVO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * <p>
 * $!{table.comment} 服务实现类
 * </p>
 *
 * @author godV
 * @since 2020-02-16
 */
@Service
@Transactional
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {
 
 
	@Autowired
    private CartMapper cartMapper;

    protected CartMapper getMapper() {
        return cartMapper;
    }
 
	@Override
	public ResponseBodyBean<List<Cart>> selectPage(PageQueryBody<Cart> vo) {
		Page<Cart> page = new Page<Cart>(vo.getPage(), vo.getSize());
		Page<Cart> CartIPage = getMapper().selectPage(page, Wrappers.<Cart>lambdaQuery());
		List<Cart> records = CartIPage.getRecords();
		return new ResponseBodyBean<List<Cart>>(records, CartIPage.getTotal());
	}

	@Override
	public List<CartVO> getCartByuseq(Integer useq) {
		// TODO Auto-generated method stub
		QueryWrapper<OrderinfoVO> queryWrapper =  new QueryWrapper<OrderinfoVO>();
		queryWrapper.eq("useq", useq);
		return this.getMapper().getCartByUseq(queryWrapper);
	}
 
 
}

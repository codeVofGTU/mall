package com.codev.mall.cart.service.impl;
 


import com.codev.mall.cart.entity.Cart;
import com.codev.mall.cart.mapper.CartMapper;
import com.codev.mall.cart.service.ICartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
 
 
}

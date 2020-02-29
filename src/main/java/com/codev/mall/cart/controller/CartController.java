 package com.codev.mall.cart.controller;
 
 
import org.springframework.stereotype.Controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codev.mall.cart.service.ICartService;
import com.codev.mall.cart.entity.Cart;
import com.codev.mall.cart.vo.CartVO;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
 
/**
*  前端控制器
* @author godV
* @since 2020-02-16
*/
@RestController
public class CartController {
	private final Logger logger = LoggerFactory.getLogger(CartController.class);
 
	@Autowired
	public ICartService CartService;
	
    protected ICartService getService() {
        return CartService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Cart
     */
	@GetMapping("/Cart/id/{id}")
	public Cart findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询分页.
     * 
     * @param vo QueryVO
     * @return Page<Cart>
     */
 	@PostMapping("/Carts/page")
    ResponseBodyBean<List<Cart>> findByPage(@RequestBody PageQueryBody<Cart> vo){
    	return getService().selectPage(vo);
    };
    
	/**
     * 修改.
     * 
     * @param vo Cart
     * @param Cart Cart
     * @return Cart
     */
    @PutMapping("/Cart/id/{id}")
    Cart put(@PathVariable String id, @RequestBody @Valid Cart vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Cart
     * @return Cart
     */
    @PostMapping("/Cart")
    Cart add(@RequestBody Cart vo){
    	return getService().save(vo)? vo:new Cart();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Cart/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
	/**
     * 按查询条件查询.
     * 
     * @param vo QueryVO
     * @return Page<Cart>
     */
 	@PostMapping("/Carts/useq/{useq}")
    List<CartVO> findByPage(@PathVariable Integer useq){
    	return getService().getCartByuseq(useq);
    };
}

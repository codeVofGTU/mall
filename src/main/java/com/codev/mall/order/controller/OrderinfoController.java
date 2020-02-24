 package com.codev.mall.order.controller;
 
 
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

import com.codev.mall.order.service.IOrderinfoService;
import com.codev.mall.order.entity.Orderinfo;
import com.codev.mall.order.vo.OrderinfoVO;
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
public class OrderinfoController {
	private final Logger logger = LoggerFactory.getLogger(OrderinfoController.class);
 
	@Autowired
	public IOrderinfoService OrderinfoService;
	
    protected IOrderinfoService getService() {
        return OrderinfoService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Orderinfo
     */
	@GetMapping("/Orderinfo/id/{id}")
	public Orderinfo findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询分页.
     * 
     * @param vo QueryVO
     * @return Page<Orderinfo>
     */
 	@PostMapping("/Orderinfos/page")
    ResponseBodyBean<List<Orderinfo>> findByPage(@RequestBody PageQueryBody<Orderinfo> vo){
    	return getService().selectPage(vo);
    };
    
	/**
     * 修改.
     * 
     * @param vo Orderinfo
     * @param Orderinfo Orderinfo
     * @return Orderinfo
     */
    @PutMapping("/Orderinfo/id/{id}")
    Orderinfo put(@PathVariable String id, @RequestBody @Valid Orderinfo vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Orderinfo
     * @return Orderinfo
     */
    @PostMapping("/Orderinfo")
    Orderinfo add(@RequestBody Orderinfo vo){
    	return getService().save(vo)? vo:new Orderinfo();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Orderinfo/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
	/**
     * 按查询条件查询分页.
     * 
     * @param vo QueryVO
     * @return Page<Orderinfo>
     */
 	@GetMapping("/Orderinfos/oseq/{oseq}")
    List<OrderinfoVO> findByPage(@PathVariable Integer oseq){
    	return getService().getAllOrderinfo(oseq);
    };
}

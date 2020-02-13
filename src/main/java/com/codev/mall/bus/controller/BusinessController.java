 package com.codev.mall.bus.controller;
 
 
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

import com.codev.mall.bus.service.IBusinessService;
import com.codev.mall.bus.entity.Business;
import com.codev.mall.bus.vo.BusinessVO;
import com.codev.mall.base.PageQueryBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
 
/**
*  前端控制器
* @author godV
* @since 2020-02-12
*/
@RestController
public class BusinessController {
	private final Logger logger = LoggerFactory.getLogger(BusinessController.class);
 
	@Autowired
	public IBusinessService BusinessService;
	
    protected IBusinessService getService() {
        return BusinessService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Business
     */
	@GetMapping("/Business/id/{id}")
	public Business findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询.
     * 
     * @param vo QueryVO
     * @return Page<Business>
     */
 	@PostMapping("/Businesss")
    List<Business> findAll(@RequestBody PageQueryBody<Business> vo){
    	return getService().selectPage(vo);
    };
	/**
     * 修改.
     * 
     * @param vo Business
     * @param Business Business
     * @return Business
     */
    @PutMapping("/Business/id/{id}")
    Business put(@PathVariable String id, @RequestBody @Valid Business vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Business
     * @return Business
     */
    @PostMapping("/Business")
    Business add(@RequestBody Business vo){
    	return getService().save(vo)? vo:new Business();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Business/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
}

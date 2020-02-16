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

import com.codev.mall.order.service.ICateringorderService;
import com.codev.mall.order.entity.Cateringorder;
import com.codev.mall.order.vo.CateringorderVO;
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
public class CateringorderController {
	private final Logger logger = LoggerFactory.getLogger(CateringorderController.class);
 
	@Autowired
	public ICateringorderService CateringorderService;
	
    protected ICateringorderService getService() {
        return CateringorderService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Cateringorder
     */
	@GetMapping("/Cateringorder/id/{id}")
	public Cateringorder findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询分页.
     * 
     * @param vo QueryVO
     * @return Page<Cateringorder>
     */
 	@PostMapping("/Cateringorders/page")
    ResponseBodyBean<List<Cateringorder>> findByPage(@RequestBody PageQueryBody<Cateringorder> vo){
    	return getService().selectPage(vo);
    };
    
	/**
     * 修改.
     * 
     * @param vo Cateringorder
     * @param Cateringorder Cateringorder
     * @return Cateringorder
     */
    @PutMapping("/Cateringorder/id/{id}")
    Cateringorder put(@PathVariable String id, @RequestBody @Valid Cateringorder vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Cateringorder
     * @return Cateringorder
     */
    @PostMapping("/Cateringorder")
    Cateringorder add(@RequestBody Cateringorder vo){
    	return getService().save(vo)? vo:new Cateringorder();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Cateringorder/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
	/**
     * 按查询条件查询分页.
     * 
     * @param vo QueryVO
     * @return Page<Cateringorder>
     */
 	@PostMapping("/Cateringorders")
    List<Cateringorder> findByPage(){
    	return getService().list();
    };
}

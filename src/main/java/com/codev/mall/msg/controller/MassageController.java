 package com.codev.mall.msg.controller;
 
 
import org.springframework.stereotype.Controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
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

import com.codev.mall.msg.service.IMassageService;
import com.codev.mall.msg.entity.Massage;
import com.codev.mall.msg.vo.MassageVO;
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
* @since 2020-02-29
*/
@RestController
public class MassageController {
	private final Logger logger = LoggerFactory.getLogger(MassageController.class);
 
	@Autowired
	public IMassageService MassageService;
	
    protected IMassageService getService() {
        return MassageService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Massage
     */
	@GetMapping("/Massage/id/{id}")
	public Massage findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询分页.
     * 
     * @param vo QueryVO
     * @return Page<Massage>
     */
 	@PostMapping("/Massages/page")
    IPage<Massage> findByPage(@RequestBody PageQueryBody<Massage> vo){
    	return getService().selectPage(vo);
    };
    
	/**
     * 修改.
     * 
     * @param vo Massage
     * @param Massage Massage
     * @return Massage
     */
    @PutMapping("/Massage/id/{id}")
    Massage put(@PathVariable String id, @RequestBody @Valid Massage vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Massage
     * @return Massage
     */
    @PostMapping("/Massage")
    Massage add(@RequestBody Massage vo){
    	return getService().save(vo)? vo:new Massage();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Massage/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
	/**
     * 查询全部.
     * 
     * @param vo QueryVO
     * @return List<Massage>
     */
 	@PostMapping("/Massages")
    List<MassageVO> findByPage(){
    	return getService().getMsgInfoAll();
    };
}

 package com.codev.mall.admin.controller;
 
 
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

import com.codev.mall.admin.service.IAdmininfoService;
import com.codev.mall.admin.entity.Admininfo;
import com.codev.mall.admin.vo.AdmininfoVO;
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
public class AdmininfoController {
	private final Logger logger = LoggerFactory.getLogger(AdmininfoController.class);
 
	@Autowired
	public IAdmininfoService AdmininfoService;
	
    protected IAdmininfoService getService() {
        return AdmininfoService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Admininfo
     */
	@GetMapping("/Admininfo/id/{id}")
	public Admininfo findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询.
     * 
     * @param vo QueryVO
     * @return Page<Admininfo>
     */
 	@PostMapping("/Admininfos")
    List<Admininfo> findAll(@RequestBody PageQueryBody<Admininfo> vo){
    	return getService().selectPage(vo);
    };
	/**
     * 修改.
     * 
     * @param vo Admininfo
     * @param Admininfo Admininfo
     * @return Admininfo
     */
    @PutMapping("/Admininfo/id/{id}")
    Admininfo put(@PathVariable String id, @RequestBody @Valid Admininfo vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Admininfo
     * @return Admininfo
     */
    @PostMapping("/Admininfo")
    Admininfo add(@RequestBody Admininfo vo){
    	return getService().save(vo)? vo:new Admininfo();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Admininfo/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
}

 package com.codev.mall.user.controller;
 
 
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

import com.codev.mall.user.service.IUserinfoService;
import com.codev.mall.user.entity.Userinfo;
import com.codev.mall.user.vo.UserinfoVO;
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
public class UserinfoController {
	private final Logger logger = LoggerFactory.getLogger(UserinfoController.class);
 
	@Autowired
	public IUserinfoService UserinfoService;
	
    protected IUserinfoService getService() {
        return UserinfoService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Userinfo
     */
	@GetMapping("/Userinfo/id/{id}")
	public Userinfo findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询.
     * 
     * @param vo QueryVO
     * @return Page<Userinfo>
     */
 	@PostMapping("/Userinfos")
    List<Userinfo> findAll(@RequestBody PageQueryBody<Userinfo> vo){
    	return getService().selectPage(vo);
    };
	/**
     * 修改.
     * 
     * @param vo Userinfo
     * @param Userinfo Userinfo
     * @return Userinfo
     */
    @PutMapping("/Userinfo/id/{id}")
    Userinfo put(@PathVariable String id, @RequestBody @Valid Userinfo vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Userinfo
     * @return Userinfo
     */
    @PostMapping("/Userinfo")
    Userinfo add(@RequestBody Userinfo vo){
    	return getService().save(vo)? vo:new Userinfo();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Userinfo/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
}

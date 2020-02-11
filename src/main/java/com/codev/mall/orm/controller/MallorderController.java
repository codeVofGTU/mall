 package com.codev.mall.orm.controller;
 
 
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

import com.codev.mall.orm.service.IMallorderService;
import com.codev.mall.orm.entity.Mallorder;
import com.codev.mall.orm.vo.MallorderVO;
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
* @since 2020-01-21
*/
@RestController
public class MallorderController {
	private final Logger logger = LoggerFactory.getLogger(MallorderController.class);
 
	@Autowired
	public IMallorderService MallorderService;
	
    protected IMallorderService getService() {
        return MallorderService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Mallorder
     */
	@GetMapping("/Mallorder/id/{id}")
	public Mallorder findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询.
     * 
     * @param vo QueryVO
     * @return Page<Mallorder>
     */
 	@PostMapping("/Mallorders")
    List<Mallorder> findAll(@RequestBody PageQueryBody<Mallorder> vo){
    	return getService().selectPage(vo);
    };
	/**
     * 修改.
     * 
     * @param vo Mallorder
     * @param Mallorder Mallorder
     * @return Mallorder
     */
    @PutMapping("/Mallorder/id/{id}")
    Mallorder put(@PathVariable String id, @RequestBody @Valid Mallorder vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Mallorder
     * @return Mallorder
     */
    @PostMapping("/Mallorder")
    Mallorder add(@RequestBody Mallorder vo){
    	return getService().save(vo)? vo:new Mallorder();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Mallorder/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
}

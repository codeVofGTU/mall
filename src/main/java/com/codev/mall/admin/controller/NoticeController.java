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

import com.codev.mall.admin.service.INoticeService;
import com.codev.mall.admin.entity.Notice;
import com.codev.mall.admin.vo.NoticeVO;
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
public class NoticeController {
	private final Logger logger = LoggerFactory.getLogger(NoticeController.class);
 
	@Autowired
	public INoticeService NoticeService;
	
    protected INoticeService getService() {
        return NoticeService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Notice
     */
	@GetMapping("/Notice/id/{id}")
	public Notice findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询.
     * 
     * @param vo QueryVO
     * @return Page<Notice>
     */
 	@PostMapping("/Notices")
    List<Notice> findAll(@RequestBody PageQueryBody<Notice> vo){
    	return getService().selectPage(vo);
    };
	/**
     * 修改.
     * 
     * @param vo Notice
     * @param Notice Notice
     * @return Notice
     */
    @PutMapping("/Notice/id/{id}")
    Notice put(@PathVariable String id, @RequestBody @Valid Notice vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Notice
     * @return Notice
     */
    @PostMapping("/Notice")
    Notice add(@RequestBody Notice vo){
    	return getService().save(vo)? vo:new Notice();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Notice/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
}

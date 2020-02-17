 package com.codev.mall.catering.controller;
 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

import com.codev.mall.catering.service.IClassificationService;
import com.codev.mall.catering.entity.Classification;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

 
/**
*  前端控制器
* @author godV
* @since 2020-02-16
*/
@RestController
public class ClassificationController {
	private final Logger logger = LoggerFactory.getLogger(ClassificationController.class);
 
	@Autowired
	public IClassificationService ClassificationService;
	
    protected IClassificationService getService() {
        return ClassificationService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Classification
     */
	@GetMapping("/Classification/id/{id}")
	public Classification findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询分页.
     * 
     * @param vo QueryVO
     * @return Page<Classification>
     */
 	@PostMapping("/Classifications/page")
    ResponseBodyBean<List<Classification>> findByPage(@RequestBody PageQueryBody<Classification> vo){
    	return getService().selectPage(vo);
    };
    
	/**
     * 修改.
     * 
     * @param vo Classification
     * @param Classification Classification
     * @return Classification
     */
    @PutMapping("/Classification/id/{id}")
    Classification put(@PathVariable String id, @RequestBody @Valid Classification vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Classification
     * @return Classification
     */
    @PostMapping("/Classification")
    Classification add(@RequestBody Classification vo){
    	return getService().save(vo)? vo:new Classification();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Classification/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
	/**
     * 查询全部.
     * 
     * @param vo QueryVO
     * @return List<Classification>
     */
 	@PostMapping("/Classifications")
    List<Classification> findByPage(){
    	return getService().list();
    };
}

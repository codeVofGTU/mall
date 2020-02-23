 package com.codev.mall.catering.controller;
 
 
import org.springframework.stereotype.Controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

import com.codev.mall.catering.service.ICateringinfoService;
import com.codev.mall.catering.entity.Cateringinfo;
import com.codev.mall.catering.vo.CateringinfoVO;
import com.codev.mall.util.FileUtils;
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
public class CateringinfoController {
	private final Logger logger = LoggerFactory.getLogger(CateringinfoController.class);
 
	@Autowired
	public ICateringinfoService CateringinfoService;
	
	private final ResourceLoader resourceLoader;
	
	private final String servePath = "http://127.0.0.1:8080/Cateringinfo/fileName/";
	
	@Value("${web.upload-path}")
	 private String path;
	
    protected ICateringinfoService getService() {
        return CateringinfoService;
    }
    @Autowired
    public CateringinfoController(ResourceLoader resourceLoader) {
    	  this.resourceLoader = resourceLoader;
    }
    
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return Cateringinfo
     */
	@GetMapping("/Cateringinfo/id/{id}")
	public Cateringinfo findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询分页.
     * 
     * @param vo QueryVO
     * @return Page<Cateringinfo>
     */
 	@PostMapping("/Cateringinfos/page")
    ResponseBodyBean<List<Cateringinfo>> findByPage(@RequestBody PageQueryBody<Cateringinfo> vo){
    	return getService().selectPage(vo);
    };
    
	/**
     * 修改.
     * 
     * @param vo Cateringinfo
     * @param Cateringinfo Cateringinfo
     * @return Cateringinfo
     */
    @PutMapping("/Cateringinfo/id/{id}")
    Cateringinfo put(@PathVariable String id, @RequestBody @Valid Cateringinfo vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo Cateringinfo
     * @return Cateringinfo
     */
    @PostMapping("/Cateringinfo")
    Cateringinfo add(@RequestBody Cateringinfo vo){
    	return getService().save(vo)? vo:new Cateringinfo();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/Cateringinfo/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
	/**
     * 按查询条件查询分页.
     * 
     * @param vo QueryVO
     * @return Page<Cateringinfo>
     */
 	@PostMapping("/Cateringinfos")
    List<CateringinfoVO> findByPage(){
    	return getService().selectAll();
    };
    
    /**
    *
    * @param file 要上传的文件
    * @return
    */
    @PostMapping("/Cateringinfo/fileUpload/id/{id}")
   	String upload(@PathVariable String id,@RequestParam("fileName") MultipartFile file) {
    	   Cateringinfo vo = new Cateringinfo();
		   vo.setSeq(Integer.valueOf(id));
	   if (FileUtils.upload(file, path, file.getOriginalFilename())){
		   vo.setPicturePath(servePath+file.getOriginalFilename());
		   getService().updateById(vo);
		   // 上传成功，回传路径
		   return servePath+file.getOriginalFilename();
	   }else {
		   vo.setPicturePath(servePath+"blank.jpg");
		   getService().updateById(vo);
		   return servePath+"blank.jpg";
	  
	   }
    }
    
    /**
      * 显示单张图片
      * @return
      */
     @SuppressWarnings("rawtypes")
     @GetMapping("/Cateringinfo/fileName/{fileName}")
     public ResponseEntity showPhotos(@PathVariable String fileName){
    	 try{
    		 // 由于是读取本机的文件，file是一定要加上的， path是在application配置文件中的路径
    		 return ResponseEntity.ok(resourceLoader.getResource("file:" + path + fileName));
    	 } catch (Exception e) {
    		 return ResponseEntity.notFound().build();
    	}
    	 
     }
}

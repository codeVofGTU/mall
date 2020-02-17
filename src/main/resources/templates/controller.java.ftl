 package ${package.Controller};
 
 
<#if restControllerStyle>
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
<#else>
import org.springframework.stereotype.Controller;
</#if>
<#if superControllerClassPackage??>
import ${superControllerClassPackage};
</#if>

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

import ${package.Service}.${table.serviceName};
import ${package.Entity}.${entity};
import ${cfg.packageName}.vo.${entity}VO;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.base.ResponseBodyBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
 
/**
* ${table.comment!} 前端控制器
* @author ${author}
* @since ${date}
*/
@RestController
<#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
  <#else>
public class ${table.controllerName} {
</#if>
	private final Logger logger = LoggerFactory.getLogger(${table.controllerName}.class);
 
	@Autowired
	public ${table.serviceName} ${entity}Service;
	
    protected ${table.serviceName} getService() {
        return ${entity}Service;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return ${table.entityName}
     */
	@GetMapping("/${table.entityName}/id/{id}")
	public ${table.entityName} findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询分页.
     * 
     * @param vo QueryVO
     * @return Page<${table.entityName}>
     */
 	@PostMapping("/${table.entityName}s/page")
    ResponseBodyBean<List<${table.entityName}>> findByPage(@RequestBody PageQueryBody<${table.entityName}> vo){
    	return getService().selectPage(vo);
    };
    
	/**
     * 修改.
     * 
     * @param vo ${table.entityName}
     * @param ${table.entityName} ${table.entityName}
     * @return ${table.entityName}
     */
    @PutMapping("/${table.entityName}/id/{id}")
    ${table.entityName} put(@PathVariable String id, @RequestBody @Valid ${table.entityName} vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo ${table.entityName}
     * @return ${table.entityName}
     */
    @PostMapping("/${table.entityName}")
    ${table.entityName} add(@RequestBody ${table.entityName} vo){
    	return getService().save(vo)? vo:new ${table.entityName}();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/${table.entityName}/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
	/**
     * 查询全部.
     * 
     * @param vo QueryVO
     * @return List<${table.entityName}>
     */
 	@PostMapping("/${table.entityName}s")
    List<${table.entityName}> findByPage(){
    	return getService().list();
    };
}

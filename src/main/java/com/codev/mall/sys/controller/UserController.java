 package com.codev.mall.sys.controller;
 
 
import org.springframework.stereotype.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codev.mall.sys.service.IUserService;
import com.codev.mall.base.PageQueryBody;
import com.codev.mall.sys.entity.User;
import com.codev.mall.sys.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
 
/**
*  前端控制器
* @author godV
* @since 2020-01-20
*/
@Controller
@RestController
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
 
	@Autowired
	public IUserService UserService;
	
    protected IUserService getService() {
        return UserService;
    }
 
	/**
     * 按id查询.
     * 
     * @param id id
     * @return User
     */
	@GetMapping("/User/id/{id}")
	public User findOne(@PathVariable String id) {
		return getService().getById(id);
	}
	
	/**
     * 按查询条件查询.
     * 
     * @param vo QueryVO
     * @return Page<User>
     */
 	@PostMapping("/Users")
 	List<User> findAll(@RequestBody PageQueryBody<User> vo){
    	return getService().selectPage(vo);
    };
	/**
     * 修改.
     * 
     * @param vo User
     * @param User User
     * @return User
     */
    @PutMapping("/User/id/{id}")
    User put(@PathVariable String id, @RequestBody @Valid User vo){
    	
    	return getService().updateById(vo)? getService().getById(id):getService().getById(id);
    }

    /**
     * 添加.
     * 
     * @param vo User
     * @return User
     */
    @PostMapping("/User")
    User add(@RequestBody User vo){
    	return getService().save(vo)? vo:new User();
    }

    /**
     * 删除.
     * 
     * @param id id
     * @return String
     */
    @DeleteMapping("/User/id/{id}")
    boolean delete(@PathVariable String id){
   		return getService().removeById(id);
    }
 
}

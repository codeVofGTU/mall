package com.codev.mall.sys.service;

import com.codev.mall.base.PageQueryBody;
import com.codev.mall.sys.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * $!{table.comment} 服务类
 * </p>
 *
 * @author godV
 * @since 2020-01-20
 */
public interface IUserService extends IService<User> {
 
	
	/**
     *  分页查询
     * @param User
     * @return
     */
	List<User> selectPage(PageQueryBody<User> vo);
}

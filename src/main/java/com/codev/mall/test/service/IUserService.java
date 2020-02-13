package com.codev.mall.test.service;

import com.codev.mall.test.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.codev.mall.base.PageQueryBody;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
/**
 * <p>
 * $!{table.comment} 服务类
 * </p>
 *
 * @author godV
 * @since 2020-02-12
 */
public interface IUserService extends IService<User> {
 
	
	/**
     *  分页查询
     * @param User
     * @return
     */
	List<User> selectPage(PageQueryBody<User> vo);
}
